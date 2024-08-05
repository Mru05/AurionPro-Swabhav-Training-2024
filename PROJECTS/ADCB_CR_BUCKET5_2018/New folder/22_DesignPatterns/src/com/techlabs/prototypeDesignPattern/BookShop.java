package com.techlabs.prototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;
//Cloneable is a marker interface which does not have any methods in it
public class BookShop implements Cloneable{
	private String name;
	@Override
	public String toString() {
		return "BookShop [name=" + name + ", books=" + books + "]";
	}
	List<Book> books = new ArrayList<>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public void loadData() {  //assume fetching data from data base but for second object u are just cloning it
		for(int i=1;i<=10;i++) {
			Book b = new Book(i, name);
			b.setBookId(i);
			b.setBookName("Book "+i);
			getBooks().add(b);
		}
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		BookShop shop = new BookShop();
		for(Book b : this.getBooks())
		{
			shop.getBooks().add(b);
		}
		return shop;
		//return super.clone();
	}
	

}
