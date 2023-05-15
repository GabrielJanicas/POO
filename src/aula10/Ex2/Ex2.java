package aula10.Ex2;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Ex2 {
public static void main(String[] args) {

		Map <String,ArrayList<Book> > b = new TreeMap<String,ArrayList<Book>>();

		ArrayList<Book> livros = new ArrayList<Book>();
		livros.add(new Book("Java","Autor1",2000));

		ArrayList<Book> livros2 = new ArrayList<Book>();
		livros2.add(new Book("C++","Autor2",2001));

		ArrayList<Book> livros3 = new ArrayList<Book>();
		livros3.add(new Book("Python","Autor3",2002));

		ArrayList<Book> livros4 = new ArrayList<Book>();
		livros4.add(new Book("C","Autor4",2003));

		ArrayList<Book> livros5 = new ArrayList<Book>();
		livros5.add(new Book("C#","Autor5",2004));

		b.put("Programação",livros);
		b.put("Redes",livros2);
		b.put("Bases de Dados",livros3);
		b.put("Sistemas Operativos",livros4);
		b.put("Algoritmos",livros5);


		System.out.println(getRandomBook("Programação",b));


	}

	public static Book getRandomBook(String genero, Map<String,ArrayList<Book>> map) {
		if (map.containsKey(genero)) {
			ArrayList<Book> livros = map.get(genero);
			int i = (int) (Math.random() * livros.size());
			return livros.get(i);
		}
		return null;
	}
}
