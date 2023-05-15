
package aula09.Ex1;



import aula07.Ex2.Date;
import aula07.Ex2.DateYMD;
import aula06.Ex1.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex1 {
public static void main(String[] args) {
		ArrayList<Integer> c1 = new ArrayList<>();
		for (int i = 10; i <= 100; i+=10)
			c1.add(i);
		System.out.println("Size: " + c1.size());
		for (int i = 0; i < c1.size(); i++)
		System.out.println("Elemento: " + c1.get(i));

		ArrayList<String> c2 = new ArrayList<>();
		c2.add("Vento");
		c2.add("Calor");
		c2.add("Frio");
		c2.add("Chuva");
		System.out.println(c2);
		Collections.sort(c2);
		System.out.println(c2);
		c2.remove("Frio");
		c2.remove(0);
		System.out.println(c2);

		Set<Pessoa> c3 = new HashSet<>();
		c3.add(new Pessoa("Ana", 123456, new DateYMD(1, 1, 2000)));
		c3.add(new Pessoa("Sofia", 123496, new DateYMD(1, 1, 2000)));
		c3.add(new Pessoa("Toino", 123456, new DateYMD(1, 1, 2000)));
		c3.add(new Pessoa("Zeca", 123456, new DateYMD(1, 1, 2000)));
		c3.add(new Pessoa("Tiago", 123456, new DateYMD(1, 1, 2000)));
		
		Set<Date> c4 = new TreeSet<>();
		c4.add(new DateYMD(1, 1, 2000));
		c4.add(new DateYMD(1, 2, 2000));
		c4.add(new DateYMD(1, 3, 2000));
		c4.add(new DateYMD(1, 4, 2000));
		c4.add(new DateYMD(1, 5, 2000));
		
	}

}
