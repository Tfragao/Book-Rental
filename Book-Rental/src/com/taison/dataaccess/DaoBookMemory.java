package com.taison.dataaccess;

import java.util.TreeMap;

import com.taison.entity.Book;

public class DaoBookMemory implements DaoBook {
	
	private static final TreeMap<Long, Book> books = new TreeMap<>();
	
	//For the time been books are been entered manually
	
	static {
		books.put(1L, new Book(1L, "Sea of Tranquility", "Emily St.John Mandel","978-0593321447"));
		books.put(2L, new Book(2L, "The immortal King Rao", "Vauhini Vara","978-0393541755"));
		books.put(3L, new Book(3L, "True Story: what reality TV says about us", "Danielle J. Lindemann" ,"978-0374279028"));
		books.put(4L, new Book(4L, "The candy house", "Jennifer Egan","978-1476716763"));
	}
	
	//For the time been I prefer using Singleton.
	
	private DaoBookMemory() {
		
	}
	
	private static final DaoBookMemory INSTANCE = new DaoBookMemory();
	
	public static DaoBookMemory getInstance() {
		return INSTANCE;
	}

	@Override
	public Iterable<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBooksById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBooksByIsbnNumber(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Book object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Book object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}
