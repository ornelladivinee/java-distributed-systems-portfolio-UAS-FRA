package sheet1.ejercicio1;

public class Factorial {
    
    // Calculates factorial of a non-negative integer --> CALCULAR EL NUMERO N 
    public static long calculateFactorial(int n) {
        if (n < 0) { // CONDICIONALIDAD
            throw new IllegalArgumentException("Number cannot be negative"); // MENSAJE DE ERROR 
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result; // RETORNA RESULTADO 
    }
    
    // Main method to test  --> METODO MAIN 
    public static void main(String[] args) {
        System.out.println("~ FACTORIAL ~\n"); // MUESTRA EN CONSOLA 
        for (int i = 0; i <= 10; i++) { // FORMULA DE CALCULO
            System.out.println(i + " = " + calculateFactorial(i)); // MUESTRA EL RESULTADO 
        }
    }
}