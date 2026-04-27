package sheet1.ejercicio2;

// SUPER CLASE O CLASE PADRE...
public class Publication {
    private String title; // define el titulo como un texto 
    private String language; // el idioma de la misma manera
    private double price; // para el precio, double porque es en EUR

    // Constructor -> como se construye luego de la definicion de cada uno
    public Publication(String title, String language, double price) {
        this.title = title;
        this.language = language;
        this.price = price;
    }

    // Print  -> este metodo muestra lo que va imprimir el ejercicio
    public void print() {
        System.out.println("Title: " + title + ", Language: " + language + ", Price: " + price + " EUR");
    }
}
