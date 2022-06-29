package homework16_06;

//Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
//Instance variables are being initialized
//Both Constructors are being executed
public class Book {

    String bookAuthor;
    String bookName;
    int pageAmount;

    Book(String author, String name) {
        bookAuthor = author;
        bookName = name;
    }

    Book(String author, String name, int amount) {
        this(author, name);
        pageAmount = amount;
    }

    String showInfo() {
        return bookName + " was written by " + bookAuthor + " and has " + pageAmount + " pages.";
    }

    public static void main(String[] args) {
        Book book1 = new Book("Stephen King", "Under the Dome");
        System.out.println(book1.showInfo());
        Book book2 = new Book("George Orwell", "1984", 320);
        System.out.println(book2.showInfo());
    }
}
