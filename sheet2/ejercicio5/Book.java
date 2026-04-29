package sheet2.ejercicio5;


public class Book extends Publication {
    private String author;
    private String isbn;

    public Book(String title, String language, double price, String author, String isbn) {
        super(title, language, price);
        this.author = author;
        this.isbn = isbn;
    }    @Override
    public void print() {
        System.out.print("BOOK - ");
        super.print();
        System.out.println("        Author: " + author + ", ISBN: " + isbn);
    }
}