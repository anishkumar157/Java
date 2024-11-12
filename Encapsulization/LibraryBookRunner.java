package com.xworkz.Encapsulization;

public class LibraryBookRunner {
	 
	public static void main(String[] args) {
		
		//Creating 1st Library Book Object
		LibraryBooks book = new LibraryBooks("Game Of Thrones", "978-3", "Dr.Kumar", "MRZ Thoppi",
				"Fantasy", 1925, 180, "English", "Shelf A3", true, null, null, null, null, 5, 0, 10.99, 0.50,
				"2024-01-10", "2024-11-01");
		
		//Creating 2nd Library Book Object
		LibraryBooks book1 = new LibraryBooks(
	            "978-3-16-148410-0", "The Great Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons",
	            "Fiction", 1925, 180, "English", "Shelf A3", true, null, null, null, null, 5, 0, 10.99, 0.50,
	            "2024-01-10", "2024-11-01");

		// Display details of the 1st book
        System.out.println("=== Details of Book 1 ===");
        book.displayBookDetails();
        
     // Display details of the 2nd book
        System.out.println("\n=== Details of Book 2 ===");
        book1.displayBookDetails();
        
		 // Using Getters and Setters for 1st Book
        System.out.println("\n=== Using Getters and Setters ===");

        // Setting new values for 1st Book
        book.setTitle("Dance of Ice And Fire");
        book.setAuthor("Dr. Lotta");
        book.setPublisher("Penguin Classics");
        book.setNumberOfCopies(10);

        // Getting and displaying updated values of 2st Book
        System.out.println("Updated Title: " + book.getTitle());
        System.out.println("Updated Author: " + book.getAuthor());
        System.out.println("Updated Publisher: " + book.getPublisher());
        System.out.println("Updated Number of Copies: " + book.getNumberOfCopies());

        // Display all book details of 1st Book after updates
        System.out.println("\n=== Book1 Details After Updates ===");
        book.displayBookDetails();
	}
	

}
