package sheet3.ejercicio7;

public class Main {
    public static void main(String[] args) {
        // CREAR OBJETO DE LA CLASE CONTENEDORA
        ShoppingBasket basket = new ShoppingBasket("My Basket");
        
        // AÑADIR ARTICULOS AL CARRITO
        ShoppingBasket.main("Lip gloss", 15.6, 10);
        ShoppingBasket.main("Bronzer", 20.9, 5);
        ShoppingBasket.main("Fundation", 18.5, 8);
        
        // BUSCAR UN ARTICULO POR NOMBRE
        ShoppingItem item = basket.searchItem("Fundation");
        if (item != null) {
            System.out.println("Item found: " + item.getName() + ", Price: " + item.getPrice() + ", Quantity: " + item.getQuantity());
            // CAMBIAR LA CANTIDAD DE UN ARTICULO
            item.changeQuantity(12);
            System.out.println("Updated Quantity for " + item.getName() + ": " + item.getQuantity());
        } else {
            System.out.println("Item not found.");
        }
    } 
}
