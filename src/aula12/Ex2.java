package aula12;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex2 {

	public static void main(String[] args) throws IOException{
		ArrayList<String> words = readFile2("./src/aula12/A_cidade_e_as_serras.txt");
		TreeMap<String, Map<String, Integer>> map = new TreeMap<String,Map<String,Integer>>();

		for (int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			if (map.containsKey(word.substring(0, 1))) {
				Map<String,Integer> map2 = map.get(word.substring(0, 1));
				if (map2.containsKey(word)) {
					int count = map2.get(word);
					map2.put(word, count + 1);
				} else {
					map2.put(word, 1);
				}
			} else {
				Map<String,Integer> map2 = new TreeMap<String,Integer>();
				map2.put(word, 1);
				map.put(word.substring(0,1), map2);
			}
		}
		System.out.println(map);

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
