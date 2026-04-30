package sheet1.ejercicio4;

import java.util.Scanner;

public class ThreadManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1; //contador para asignar números a los hilos

        System.out.println("Escribe un numero y pulsa Enter para crear un hilo.");
        System.out.println("Para salir, escribe 'salir'.\n");

        while (true) {
            System.out.print("> ");
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("salir")) {
                break;
            }
            System.out.println("Creando hilo con número: " + counter); // Línea de depuración
            NumberThread t = new NumberThread(counter);
            t.start();
            counter++;
        }
        sc.close();
        System.out.println("Programa terminado.");
    }
}