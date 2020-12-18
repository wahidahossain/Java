package com.mtm.ticket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="book")
public class Book {
	
	
	@Id
	@Column(name="bookid")
	private int bookId;
	
	@Column(name="booktitle")
	private String bookTitle;
	
	@Column(name="isbn")
	private String isbn;
	
	@Column(name="author")
	private String author; 
	
	@Column(name="releaseyear")
	private int releaseYear; 
	
	@Column(name="language")
	private String language; 
	
	@Column(name="price")
	private int price;

	
	
	public Book(String bookTitle, String isbn, String author, int releaseYear, String language,
			int price) {
		super();
		this.bookTitle = bookTitle;
		this.isbn = isbn;
		this.author = author;
		this.releaseYear = releaseYear;
		this.language = language;
		this.price = price;
	}
	

	public Book() {
		super();
	}




	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + bookId;
		result = prime * result + ((bookTitle == null) ? 0 : bookTitle.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + price;
		result = prime * result + releaseYear;
		return result;
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
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bookId != other.bookId)
			return false;
		if (bookTitle == null) {
			if (other.bookTitle != null)
				return false;
		} else if (!bookTitle.equals(other.bookTitle))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (price != other.price)
			return false;
		if (releaseYear != other.releaseYear)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", isbn=" + isbn + ", author=" + author
				+ ", releaseYear=" + releaseYear + ", language=" + language + ", price=" + price + "]";
	}



}
