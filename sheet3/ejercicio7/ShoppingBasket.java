package sheet3.ejercicio7;
import java.util.ArrayList;
import java.util.List;

// CLASE CONTENEDORA, EN ESTE EJERCICIO NO EXISTE HERENCIA 

public class ShoppingBasket { 
    // CREAR ATRIBUTOS PRIVADOS
    private String basketName; 
    private static List <ShoppingItem> items; 
    
    
    // constructor 
    public ShoppingBasket(String name) {
        this.basketName = name;
        ShoppingBasket.items = new ArrayList<>();
}


    // metodo para añadir, crea el objeto y lo guarda
    public static void main(String name, double price, int quantity ) {
        ShoppingItem newItem = new ShoppingItem(name, price, quantity);
        items.add(newItem);
        
 }

 // metodo para buscar por nombre 
 public ShoppingItem searchItem(String name) {
    for (ShoppingItem item : items) {
        if (item.getName().equals(name)) {
            return item;
        }
    }
    return null; // condicionalidad si no lo encuentra

    }  
     //getter 
     public List<ShoppingItem> getItems() {
        return items;
    }

    public String getBasketName() {
        return basketName;
    }

}