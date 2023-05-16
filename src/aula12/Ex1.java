package aula12;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		Set<String> words = readFile("./src/aula12/movies.txt");
		ArrayList<String> array = readFile2("./src/aula12/movies.txt");   
		System.out.println(" distinct words:" + words.size() );
		System.out.println(" total words:" + array.size() );

	}


public static Set<String> readFile(String path) throws IOException {
	Scanner input = new Scanner(new FileReader(path));
	input.useDelimiter("[\\t\\n\\r.,:'‘’;?!-*{}=+&/()\\[\\]”“\"\\' ]+");

	Set<String> words = new HashSet<String>();

	while (input.hasNext()) {
		String word = input.next();
		if (word.length() > 0) words.add(word.toLowerCase());
	}
	return words;
}
public static ArrayList<String> readFile2(String path) throws IOException {
	Scanner input = new Scanner(new FileReader(path));
	input.useDelimiter("[\\t\\n\\r.,:'‘’;?!-*{}=+&/()\\[\\]”“\"\\' ]+");

	ArrayList<String> words = new ArrayList<String>();

	while (input.hasNext()) {
		String word = input.next();
		if (word.length() > 0) words.add(word.toLowerCase());
	}
	return words;
}
}