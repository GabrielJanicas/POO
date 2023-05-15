package aula10.Ex1;

import java.util.HashMap;
import java.util.Map;


public class Mapa {
	
	Map<String, Book> map = new HashMap<String, Book>();


	public void add(String genero, Book livro) {
		map.put(genero, livro);
	}

	public void replace(String genero, Book significado) {
		map.replace(genero, significado);
	}

	public void remove(String genero) {
		map.remove(genero);
	}
	public String toString() {
		return map.toString();
	}
	
}
