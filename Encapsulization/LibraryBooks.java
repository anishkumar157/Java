package com.xworkz.Encapsulization;

public class LibraryBooks {
	  
		// private variables
	private String title;
    private String isbn;
    private String author;
    private String publisher;
    private String genre;
    private int publishedYear;
    private int numberOfPages;
    private String language;
    private String shelfLocation;
    private boolean isAvailable;
    private String borrowerName;
    private String borrowerId;
    private String checkoutDate;
    private String dueDate;
	private int numberOfCopies;
    private int timesBorrowed;
    private double bookPrice;
    private double finePerDay;
    private String addedDate;
    private String lastIssuedDate;
    
    
    // parameterized constructor
    
    public LibraryBooks(String title, String isbn, String author, String publisher, String genre, int publishedYear,
			int numberOfPages, String language, String shelfLocation, boolean isAvailable, String borrowerName,
			String borrowerId, String checkoutDate, String dueDate, int numberOfCopies, int timesBorrowed,
			double bookPrice, double finePerDay, String addedDate, String lastIssuedDate) {
    	
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.publisher = publisher;
		this.genre = genre;
		this.publishedYear = publishedYear;
		this.numberOfPages = numberOfPages;
		this.language = language;
		this.shelfLocation = shelfLocation;
		this.isAvailable = isAvailable;
		this.borrowerName = borrowerName;
		this.borrowerId = borrowerId;
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.numberOfCopies = numberOfCopies;
		this.timesBorrowed = timesBorrowed;
		this.bookPrice = bookPrice;
		this.finePerDay = finePerDay;
		this.addedDate = addedDate;
		this.lastIssuedDate = lastIssuedDate;
	}
    
    
		//Getters And Setters
    
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getShelfLocation() {
		return shelfLocation;
	}

	public void setShelfLocation(String shelfLocation) {
		this.shelfLocation = shelfLocation;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getBorrowerName() {
		return borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public String getBorrowerId() {
		return borrowerId;
	}

	public void setBorrowerId(String borrowerId) {
		this.borrowerId = borrowerId;
	}

	public String getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	public int getTimesBorrowed() {
		return timesBorrowed;
	}

	public void setTimesBorrowed(int timesBorrowed) {
		this.timesBorrowed = timesBorrowed;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getFinePerDay() {
		return finePerDay;
	}

	public void setFinePerDay(double finePerDay) {
		this.finePerDay = finePerDay;
	}

	public String getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}

	public String getLastIssuedDate() {
		return lastIssuedDate;
	}

	public void setLastIssuedDate(String lastIssuedDate) {
		this.lastIssuedDate = lastIssuedDate;
	}
    
	
		//Methods
	
    public void borrowBook(String title, boolean isAvailable, String shelfLocation ) {
    	
    	if(isAvailable == true) {
    		
    		System.out.println("The Book "+title+" is avilable at location "+shelfLocation);
    	}
    	else {
    		
    		System.out.println("The Book is not Available");
    	}
    }
    
    
    public void returnBook() {
    	
            System.out.println("Book returned successfully.");
        }
    
    
    
    public void displayBookDetails() {
        
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Genre: " + genre);
        System.out.println("Publish Year: " + publishedYear);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Language: " + language);
        System.out.println("Shelf Location: " + shelfLocation);
        System.out.println("Availability: " + isAvailable);
        System.out.println("Number of Copies: " + numberOfCopies);
        System.out.println("Times Borrowed: " + timesBorrowed);
        System.out.println("Price: $" + bookPrice);
        System.out.println("Fine per Day: $" + finePerDay);
        System.out.println("Added Date: " + addedDate);
        System.out.println("Last Issued Date: " + lastIssuedDate);
    }
}
