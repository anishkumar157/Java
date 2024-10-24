public class BookInfo{ 

    static String format;
    static boolean hasISBN;
    static String language;;


    String title;
    String author;
    int numberOfPages;
    String genre; 

    static {

         format = "Paperback";
         hasISBN = true;
         language = "English";
    }
        
   

    public BookInfo(String title, String author, int numberOfPages, String genre){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    public void printDetails(){

        System.out.println("Book Format: "+format);
        System.out.println("Languge: "+language);
        System.out.println("Has ISBN: "+hasISBN);
        System.out.println("BOOK Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Number Of Pages: "+numberOfPages);        
        System.out.println("genre: "+genre);
    }
}