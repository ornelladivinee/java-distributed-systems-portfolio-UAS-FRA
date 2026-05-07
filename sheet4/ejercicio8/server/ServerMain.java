/* 
**LOGICA Y ESTRUCTURA DE LAS CARPETAS**

Sheet4/
├── shared/           <-- Lo que ambos necesitan conocer (servidor y cliente) es la clase en comun de Server & Client
│   ├── Message.java  (La clase que serializarás) : Serializable class for communication
│   └── BasketInterface.java (Asegura firmas iguales) : ensure consistent
├── server/           <-- Solo corre en el lado del servidor : Server-side logic
│   ├── ServerMain.java
│   └── Basket.java   (La lógica real de la cesta) : business logic
└── client/           <-- Solo corre en el lado del cliente : Client-side logic
    ├── ClientMain.java
    └── BasketProxy.java (El "impostor" que habla con el socket) : Proxy/Stub for remote invocation 
    */



package sheet4.ejercicio8.server;

public class ServerMain {
    
}
