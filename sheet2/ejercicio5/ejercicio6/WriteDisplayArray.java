package sheet2.ejercicio5.ejercicio6;

import java.io.*;

public class WriteDisplayArray {
    public static void main(String[] args) {
        // Crear el array de Display igual que en ejercicio 5
        Display[] items = new Display[5];
        items[0] = new Publication("The Hobbit", "English", 15.99);
        items[1] = new Book("1984", "English", 12.50, "George Orwell", "978-0451524935");
        items[2] = new Car("Red", 150, 1200.5);
        items[3] = new Publication("Clean Code", "English", 45.00);
        items[4] = new Car("Blue", 200, 1450.0);

        // Escribir el array a un archivo
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("display_array.ser"))) {
            oos.writeObject(items);
            System.out.println("Array written to file 'display_array.ser' successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
/*# Compilar todo el paquete
javac -d . sheet2/ejercicio6/*.java

# Ejecutar escritura
java -cp . sheet2.ejercicio6.WriteDisplayArray

# Ejecutar lectura
java -cp . sheet2.ejercicio6.ReadDisplayArray*/}