package sheet2.ejercicio5;

public class MainDisplay {
    public static void main(String[] args) {
        // Array de tipo Display
        Display[] items = new Display[5];

        // Asignar objetos de diferentes clases que implementan Display
        items[0] = new Publication("The Hobbit", "English", 15.99);
        items[1] = new Book("1984", "English", 12.50, "George Orwell", "978-0451524935");
        items[2] = new Car("Red", 150, 1200.5);
        items[3] = new Publication("Clean Code", "English", 45.00);
        items[4] = new Car("Blue", 200, 1450.0);

        // Recorrer el array y llamar a print()
        for (Display d : items) {
            d.print();
            System.out.println(); // línea en blanco para separar
        }
    }
}