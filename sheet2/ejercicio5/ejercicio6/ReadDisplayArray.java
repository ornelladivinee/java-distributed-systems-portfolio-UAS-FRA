package sheet2.ejercicio5.ejercicio6;

import java.io.*;

public class ReadDisplayArray {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("display_array.ser"))) {
            Display[] items = (Display[]) ois.readObject();
            System.out.println("Array read from file. Contents:\n");
            for (Display d : items) {
                d.print();
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}