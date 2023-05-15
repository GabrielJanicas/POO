package aula10;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Ex4 {

	static ArrayList<String> palavras = new ArrayList<String>();

	
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(new FileReader("aula10/Ex3.java"));
		while (input.hasNext()) {
			String word = input.next();

			if (word.length() > 2){
				palavras.add(word);
			}

			if (word.charAt(word.length()-1) == 's'){
				System.out.println(word);
			}
			System.out.println(word);
		}
		for(int i = 0; i < palavras.size();i++){

			String palavra = palavras.get(i);
				if (!palavra.matches("[a-zA-Z]+")){
					palavras.remove(i);
				}
		}
	}

}
