package sheet1.ejercicio2;

// CLASE HIJA DE PUBLICATION
// en esta clase se hereda book desde publicacion
public class Book extends Publication { 
    private String author;
    private String isbn;

    // Constructor -> LLAMA AL CONSTRUCTOR DE PUBLICACION
    public Book(String title, String language, double price, String author, String isbn) {
        super(title, language, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override // RESULTADO PARA PANTALLA
    public void print() {
        System.out.print("BOOK  ~~  ");
        super.print();
        System.out.println("        Author: " + author + ", ISBN: " + isbn);
    }
}
