package com.julianrendon.testclass;

import com.julianrendon.javainheritance.Book;
import com.julianrendon.javainheritance.Product;
import com.julianrendon.javainheritance.Software;

public class TestClass {

	public static void main(String[] args) {

		Book b = new Book();
		b.setCode("java");
		b.setDescription("Murach's Beggining Java 2");
		b.setPrice(49.50);
		b.setAuthor("Steelman");

		Software s = new Software();
		s.setCode("textp");
		s.setDescription("TextPad");
		s.setPrice(27.00);
		s.setVersion("4.7.3");

		Product p;
		p = b;
		System.out.println(p.toString()); // calls toString from the Book class

		p = s;
		System.out.println(p.toString()); // call toString from the Software class

		Product p2 = new Book();
		Class c = p2.getClass();
		System.out.println(c.getName());

	}

}
