package oop;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isAvailable;
	
	public Book(String title,String author,String isbn) {
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.isAvailable=true;// By default, a new book is available
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getIsbn() {
		return isbn;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void setAvailable(boolean available) {
		this.isAvailable=available;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", isavailable=" + isAvailable + "]";
	}
	
	
	
}
