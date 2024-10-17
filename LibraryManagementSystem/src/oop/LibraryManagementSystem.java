package oop;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		Library library = new Library();
		 
		// Create books
		Book b1 = new Book("Java Programming", "John Doe", "1234");
		Book b2 = new Book("OOP Concepts", "Jane Smith", "5678");
		
		// Add books to the library
		library.addBook(b1);
		library.addBook(b2);
		
		// Create users
		
		User student = new Student("Alice", 12);
        User faculty = new Faculty("Bob", 44);
        
        // Register users
        library.addUser(student);
        library.addUser(faculty);

        // Borrow and return books
        library.borrowBook(student, "1234");
        library.returnBook(student, "1234");

        // Display available books
        library.showAllBooks();
		
	}

}
