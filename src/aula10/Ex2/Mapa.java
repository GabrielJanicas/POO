package aula10.Ex2;

import java.util.Map;
import java.util.TreeMap;

public class Mapa {

	Map<String, Book> map = new TreeMap<String, Book>();


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
