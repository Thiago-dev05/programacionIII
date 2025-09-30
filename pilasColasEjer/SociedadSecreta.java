package pilasColasEjer;

import java.util.PriorityQueue;
import java.util.Queue;

public class SociedadSecreta {
    Queue<String> cola = new PriorityQueue<>();

    public String formarSociedad(String[] nombres) {

        String sociedad = "";
        for (int i = 0; i < nombres.length; i++) 
            cola.add(nombres[i].toUpperCase()); // ["Carlos", "Ana", "Pedro", "Beatriz"]
            
        int tam = cola.size();
        for (int i = 0; i < tam; i++) 
            sociedad += cola.poll().charAt(0); // "ABCP"

        return sociedad; // "ABCP"
    }
}
