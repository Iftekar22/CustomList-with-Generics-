package com.Generics.CustomList;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomListMathodTest {

	@Test
	public void testAdd() {
		CustomListMathod<Book> list = new CustomListMathod<>();
		list.add(new Book("Unnone", "Head First Java", "12/11/2010", 2222.22, 3500.0));
		Book b = new Book("Unnone", "Head First Java", "12/11/2010", 2222.22, 3500.0);

		assertEquals(b.toString(), list.toString());
	}

	@Test
	public void testGet() {
		CustomListMathod<Book> list = new CustomListMathod<>();
		list.add(new Book("Unnone", "Head First Java", "12/11/2010", 2222.22, 3500.0));
		list.add(new Book("Oracle", "Java: A Beginner’s Guide", "07/11/2012", 3452.22, 2500.0));
		Book b = new Book("Oracle", "Java: A Beginner’s Guide", "07/11/2012", 3452.22, 2500.0);

		assertEquals(b.toString(), list.get(1).toString());
	}

	@Test
	public void testRemove() {
		CustomListMathod<Book> list = new CustomListMathod<>();
		list.add(new Book("Unnone", "Head First Java", "12/11/2010", 2222.22, 3500.0));
		list.add(new Book("Oracle", "Java: A Beginner’s Guide", "07/11/2012", 3452.22, 2500.0));
		Book b = new Book("Oracle", "Java: A Beginner’s Guide", "07/11/2012", 3452.22, 2500.0);
		list.remove(0);

		assertEquals(b.toString(), list.get(0).toString());
	}

	@Test
	public void testSize() {
		CustomListMathod<Book> list = new CustomListMathod<>();
		list.add(new Book("Unnone", "Head First Java", "12/11/2010", 2222.22, 3500.0));
		list.add(new Book("Oracle", "Java: A Beginner’s Guide", "07/11/2012", 3452.22, 2500.0));
		
		assertEquals(list.size(), 2);
	}

}
