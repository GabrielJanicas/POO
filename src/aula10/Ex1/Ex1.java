package aula10.Ex1;

public class Ex1 {
	public static void main(String[] args) {
			Mapa b = new Mapa();

			b.add("Policia", new Book("Harry Potter","J.K.Rowling",1997));
			b.add("Aventura", new Book("Hoobit","J.R.R.Tolkien",1937));
			b.add("Drama", new Book("Uma Vida","Guy de Maupassant",1883));
			b.add("Terror", new Book("It","Stephen King",1986));
			b.add("Aventura", new Book("O Senhor dos Aneis","J.R.R.Tolkien",1954));
			b.replace("Policia", new Book("Harry Potter","J.K.Rowling",1997));
			b.remove("Aventura");
		System.out.println(b);
	}
			
}
