package oop;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books;
	private ArrayList<User> users;

public Library() {
	books = new ArrayList<>();
	users = new ArrayList<>();
	}	
//add book
public void addBook(Book book) {
	books.add(book);
	System.out.println(book.getTitle()+" added to the library");
}
//remove book
public void removeBook(Book book) {
	books.remove(book);
	System.out.println(book.getTitle()+" removed from the library");
}
//Register a user
public void addUser(User user) {
	users.add(user);
	System.out.println(user.getName()+" registered");
}

//Borrow a book
public void borrowBook(User user, String isbn) {
    for (Book book : books) {
        if (book.getIsbn().equals(isbn) && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(user.getName() + " borrowed " + book.getTitle());
            return;
        }
    }
    System.out.println("Book not available.");
}

// Return a book
public void returnBook(User user, String isbn) {
    for (Book book : books) {
        if (book.getIsbn().equals(isbn) && !book.isAvailable()) {
            book.setAvailable(true);
            System.out.println(user.getName() + " returned " + book.getTitle());
            return;
        }
    }
    System.out.println("This book wasn't borrowed.");
}

//display all books

public void showAllBooks() {
	for(Book book : books) {
		System.out.println(book);
	}
}

}