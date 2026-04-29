package sheet2.ejercicio5;

public class Publication implements Display {
    private String title;
    private String language;
    private double price;

    public Publication(String title, String language, double price) {
        this.title = title;
        this.language = language;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Title: " + title + ", Language: " + language + ", Price: " + price + " EUR");
    }
}