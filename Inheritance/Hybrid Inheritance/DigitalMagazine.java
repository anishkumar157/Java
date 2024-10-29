public class DigitalMagazine extends Magazine {
    double fileSize;
    String downloadLink;
    boolean hasAudioVersion;

    public void printDetails() {
        readMagazines();
        System.out.println("Title: " + title);
        System.out.println("Author Name: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("issueNumber: " + issueNumber);
        System.out.println("frequency: " + frequency);
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Download Link: " + downloadLink);
        System.out.println("Has Audio Version: " +hasAudioVersion);
    }
}