package pilasColasEjer;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class SegundoMasGrande {
   Queue<Integer> cola = new PriorityQueue<>();
   Stack<Integer> pila = new Stack<>();
   
    public int segundoMasGrande(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            cola.add(nums[i]); // [10, 20, 30, 40, 50]
        }
        int tam = cola.size();
        for (int i = 0; i < tam; i++) {
            pila.push(cola.poll());
        }
        pila.pop(); // [10, 20, 30, 40]
        return pila.pop(); // 40
    }
}
