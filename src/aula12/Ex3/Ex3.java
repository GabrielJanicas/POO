package aula12.Ex3;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex3 {

	public static void main(String[] args) throws IOException{
		ArrayList<Movie> filmes = new ArrayList<Movie>();
		Scanner input = new Scanner(new FileReader("./src/aula12/movies.txt"));
		input.nextLine();
		while (input.hasNextLine()) {
			String line = input.nextLine();
			String[] movie =line.split("\t");

			Movie f = new Movie(movie[0],Float.parseFloat(movie[1]),movie[3],movie[2], Integer.parseInt(movie[4]));
			filmes.add(f);
		}
		input.close();

		filmes.sort((movie1, movie2) -> movie1.getTitle().compareTo(movie2.getTitle()));
		System.out.println("Ordem alfabetica");
		System.out.println(filmes);
		filmes.sort((movie1,movie2) -> (movie1.getScore() - movie2.getScore()) > 0 ? -1 : 1);
		System.out.println("Ordem decrescente de score");
		System.out.println(filmes);
		filmes.sort((movie1,movie2) -> movie1.getRuntime() - movie2.getRuntime()> 0 ? 1 : -1);
		System.out.println("Ordem crescente de runtime");
		System.out.println(filmes);

		Map<String,Integer> generos = new TreeMap<String,Integer>();

		for (int i = 0; i < filmes.size(); i++) {
			Movie movie = filmes.get(i);
			if (!generos.containsKey(movie.getGenre())) {
				generos.put(movie.getGenre(), 1);
			}
			else{
				int count = generos.get(movie.getGenre());
				generos.put(movie.getGenre(), count + 1);
			}
			}
		System.out.println(generos);


		}
	}

