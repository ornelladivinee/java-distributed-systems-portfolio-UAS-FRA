package sheet3.ejercicio7;

public class Main {
    public static void main(String[] args) {
        // CREAR OBJETO DE LA CLASE CONTENEDORA
        ShoppingBasket basket = new ShoppingBasket("My Basket");
        
        // AÑADIR ARTICULOS AL CARRITO
        basket.addItem(new ShoppingItem("Lip Gloss", 29.99, 5));
        basket.addItem(new ShoppingItem("Fundation", 49.99, 10));
        basket.addItem(new ShoppingItem("Mascara", 19.99, 3));
        basket.addItem(new ShoppingItem("Eyeliner", 14.99, 7));
        
        // BUSCAR UN ARTICULO POR NOMBRE
        ShoppingItem item = basket.searchItem("Fundation");
        if (item != null) {
            System.out.println("Item found: " + item.getName() + ", Price: " + item.getPrice() + ", Quantity: " + item.getQuantity());
        
            ShoppingItem item1 = basket.searchItem("Mascara");
            if (item1 != null) {
                System.out.println("Item found: " + item1.getName() + ", Price: " + item1.getPrice() + ", Quantity: " + item1.getQuantity());        



            // CAMBIAR LA CANTIDAD DE UN ARTICULO
            item1.changeQuantity(12);
            System.out.println("Updated Quantity for " + item1.getName() + ": " + item1.getQuantity());
        } else {
            System.out.println("Item not found."); //control de excepciones
        }
    } 
    }
}
