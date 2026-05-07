/* 
CLASE COMPARTIDA ENTRE CLIENTE Y SERVIDOR.

SE UTILIZA PARA TRANSPORTAR LA INFORMACION NECESARIA
PARA LA INVOCACION REMOTA DE METODOS MEDIANTE UDP SOCKETS.

EL OBJETO CONTIENE:
- EL NOMBRE DEL OBJETO REMOTO
- EL METODO A EJECUTAR
- LOS PARAMETROS NECESARIOS

LA CLASE DEBE SER SERIALIZABLE YA QUE UDP SOLO TRANSPORTA BYTES.
*/

package sheet4.ejercicio8.shared; // Para que esta clase pueda ser convertida a bytes y enviada por UDP
import java.io.Serializable; // Para que esta clase pueda ser convertida a bytes y enviada por UDP
public class Message {
    private String basketId; // Identificador de la cesta (puede ser un nombre o ID)
    private String methodName; // Nombre del método a ejecutar (e.g., "addItem", "removeItem", "getItems")  
    private Object[] parameters; // Parámetros necesarios para el método (puede ser un array de objetos)
    private Object result; // Resultado de la ejecución del método (puede ser cualquier objeto serializable)
    
    // Constructor para crear un mensaje de solicitud (sin resultado)
    public Message(String basketId, String methodName, Object[] parameters, Object result) {
        this.basketId = basketId;
        this.methodName = methodName;
        this.parameters = parameters;
        this.result = result;
    }

    // getter y setter para cada campo (para que el servidor pueda acceder a ellos después de deserializar el mensaje)
    public String getBasketId() {
        return basketId;
    }

    public void setBasketId(String basketId) {
        this.basketId = basketId;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParameters() {
        return parameters;
    }

    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
    }




