package com.taison.entity;

import java.util.Objects;

public class Book {
	private Long id;
	private String title;
	private String auhtor;
	private String isbnNumber;

	public Book(Long id, String title, String author, String isbnNumber) {
		setId(id);
		setTitle(title);
		setAuhtor(isbnNumber);
		setIsbnNumber(isbnNumber);
	}

	public Book() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuhtor() {
		return auhtor;
	}

	public void setAuhtor(String auhtor) {
		this.auhtor = auhtor;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", auhtor=" + auhtor + ", isbnNumber=" + isbnNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(auhtor, id, isbnNumber, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(auhtor, other.auhtor) && Objects.equals(id, other.id)
				&& Objects.equals(isbnNumber, other.isbnNumber) && Objects.equals(title, other.title);
	}

}
