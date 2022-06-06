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
		
		return books.values();
	}

	@Override
	public Book getBooksById(Long id) {
		
		return books.get(id);
	}

	@Override
	public Book getBooksByIsbnNumber(String isbn) {
		
		return books.get(isbn);  //TODO : Pay attention to this warning
	}

	@Override
	public void insert(Book book) {
		Long id = books.size() > 0 ? books.lastKey() + 1L : 1L;
		book.setId(id);
		books.put(book.getId(), book);
		
	}

	@Override
	public void modify(Book book) {
		books.put(book.getId(), book);
		
	}

	@Override
	public void delete(Long id) {
		books.remove(id);
		
	}
	
}
