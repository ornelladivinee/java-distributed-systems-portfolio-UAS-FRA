package sheet3.ejercicio7;

// CLASE CONTENIDA, EN ESTE EJERCICIO NO EXISTE HERENCIA
public class ShoppingItem {

// CREAR ATRIBUTOS PRIVADOS
private String name; 
private double price;
private int quantity;

// constructor
public ShoppingItem(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
}

// getters y setters
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
public int getQuantity() {
    return quantity;
}
public void setQuantity(int quantity) {
    this.quantity = quantity;
}

// METODO PARA CAMBIAR LA CANTIDAD 
public void changeQuantity(int newQuantity) {
    this.quantity = newQuantity;

    
}

}
