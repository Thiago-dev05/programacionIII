package pilasColasEjer;

import java.util.LinkedList;
import java.util.Queue;

public class VotosFavorContra {
    Queue<Integer> colaVotos;

    public int contarVotos(int upvotes, int downvotes) {
        colaVotos = new LinkedList<>();
        
        // Almacenar en la cola los votos
        for (int i = 0; i < upvotes; i++) {
            colaVotos.add(1);
        }
        for (int i = 0; i < downvotes; i++) {
            colaVotos.add(-1);
        }
        // Recorrer la cola
        int tam = colaVotos.size();
        int up = 0, down = 0;

        for (int i = 0; i < tam; i++) {
            if (colaVotos.peek() == 1) {
                up += 1;
            } else
                down += 1;

            colaVotos.poll();
        }

        return up - down;
    }
}
