class Textbook extends Book {
    String subject;
    String edition;
    boolean isLabRequired;


    public void printDetails() {
        bookRead();
        System.out.println("Title: " + title);
        System.out.println("Author Name: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Genre: " + genre);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Subject: " + subject);
        System.out.println("Edition: " + edition);
        System.out.println("Lab Required: " +isLabRequired);
    }
}