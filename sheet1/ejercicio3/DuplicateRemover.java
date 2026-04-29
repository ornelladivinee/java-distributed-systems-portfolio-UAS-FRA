package sheet1.ejercicio3;

// importacion necesarias
import java.util.HashSet;
import java.util.Iterator;   // Añadido para usar Iterator

// declaracion de la clase y `main` method
public class DuplicateRemover {
    public static void main(String[] args) {
        // Crear un HashSet para almacenar elementos únicos
        HashSet<String> set = new HashSet<>(); // crea un objeto vacío. Los <> se llaman "diamond operator" y evitan repetir el tipo por segunda vez.

        // Insertar todas las cadenas de la línea de comandos en el conjunto
        for (String arg : args) {
            set.add(arg);   // HashSet ignora duplicados automáticamente
        }

        // Recorrer el conjunto con un Iterator y mostrar cada elemento
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

/* INSTRUCCIONES PARA EJECUTAR EL PROGRAMA (CON PACKAGE):
   Abre la terminal en VS Code (Ctrl + `) y escribe:
   javac -d . sheet1/ejercicio3/DuplicateRemover.java
   java -cp . sheet1.ejercicio3.DuplicateRemover hola mundo hola java mundo
   NOTA: Sustituye "hola mundo hola java mundo" por cualquier lista de cadenas.
*/
