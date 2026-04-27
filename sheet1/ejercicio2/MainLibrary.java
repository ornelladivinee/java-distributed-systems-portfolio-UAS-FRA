package sheet1.ejercicio2;

//clase independiente que ejecuta el programa o clase control remoto 
public class MainLibrary { // aqui es donde se crean y utilizan objetos
    public static void main(String[] args) {
         // se crea un array de tipo Publication

        Publication[] items = new Publication[5]; // aqui esta el tamanio del array que en este caso es 5 porque es del 0 al 4
        // aqui se llena el array con objetos
        
        items[0] = new Book("We Should All Be Millionaires", "English", 13.0, "Rachel Rodgers", "ISBN1");
        items[1] = new Book("Mentalidad de exito", "Spanish", 5.0, "Carol S. Dweck", "ISBN2");
        items[2] = new Book("Girlboss", "English", 23.0, "Sophia Amoruso", "ISBN3");
        items[3] = new Book("Los secretos de la mente millonaria", "Spanish", 19.0, "T. Harv Eker", "ISBN4");
        items[4] = new Book("Lean In", "English", 63.0, "Sheryl Sandberg", "ISBN5");
           
        // aqui recorre y llama al print creado en publication
            for (Publication p : items) {
                p.print();
            System.out.println();
        }
    }
}