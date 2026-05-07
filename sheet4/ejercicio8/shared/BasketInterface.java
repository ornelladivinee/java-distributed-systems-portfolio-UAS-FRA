/* ES UNA BUENA PRACTICA, 
EL EJERCICIO NO LA PIDE EXPLICITAMENTE PERO ES NECESARIA PARA:
mantener consistencia, mismas firmas, y hace que Basket y BasketProxy “parezcan” el mismo objeto.
*/

package sheet4.ejercicio8.shared;
import java.util.List; // importa la clase List para usarla en el método getItems()

import sheet3.ejercicio7.ShoppingItem;
public interface BasketInterface { // no es class es interfaz NO tiene lógica, solo define métodos.
void addItem(String name, double price, int quantity); // no devuelve nada solo agrega cosas
ShoppingItem searchItem(String name); // devuelve el objeto ShoppingItem que se llama igual, o null si no lo encuentra
List<ShoppingItem> getItems(); // devuelve la lista de objetos ShoppingItem que hay en la cesta
boolean updateItemQuantity(String name, int newQuantity); // devuelve true si encuentra el item y actualiza la cantidad, false si no lo encuentra
    
}