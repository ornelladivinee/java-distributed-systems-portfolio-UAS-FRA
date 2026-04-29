package sheet2.ejercicio5.ejercicio6;

public class Book extends Publication {
    private static final long serialVersionUID = 1L;
    private String author;
    private String isbn;

    public Book(String title, String language, double price, String author, String isbn) {
        super(title, language, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        System.out.print("BOOK - ");
        super.print();
        System.out.println("        Author: " + author + ", ISBN: " + isbn);
    }
}