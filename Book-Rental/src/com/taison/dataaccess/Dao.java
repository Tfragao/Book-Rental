package com.taison.dataaccess;

public interface Dao<T> {
	Iterable<T> getAllBooks();
	T getBooksById(Long id);
	T getBooksByIsbnNumber(String isbn);
	
	void insert(T object);
	void modify(T object);
	void delete(Long id);
}
