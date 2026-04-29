package sheet1.ejercicio4;

public class NumberThread extends Thread {
    private int number;

    public NumberThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + number);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + number + " interrupted.");
        }
    }
}


/* 
 Compila creando la estructura de carpetas respetando los packages
javac -d . sheet1/ejercicio4/*.java

# Ejecuta (la raíz del classpath es el directorio actual)
java -cp . sheet1.ejercicio4.ThreadManager
*/ 
