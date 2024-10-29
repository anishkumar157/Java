public class LibraryRunner {
    public static void main(String[] args) {
        Textbook book = new Textbook();
        book.title = "Object Oriented Using Java";
        book.author = "Michle";
        book.publicationYear = 2021;
        book.genre = "Programming Language";
        book.numberOfPages = 1270;
        book.subject = "Java";
        book.edition = "8th Edition";
        book.isLabRequired = true;


        book.printDetails();


        DigitalMagazine magazine = new DigitalMagazine();
        magazine.title = "Tech Trends";
        magazine.author = "John";
        magazine.publicationYear = 2023;
        magazine.issueNumber = "October 2023";
        magazine.frequency = "Monthly";
        magazine.fileSize = 15.5;
        magazine.downloadLink = "www.techtrends.com/download";
        magazine.hasAudioVersion = true;

        magazine.printDetails();


    }
}

