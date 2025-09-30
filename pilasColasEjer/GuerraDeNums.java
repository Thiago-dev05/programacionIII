package pilasColasEjer;

import java.util.LinkedList;
import java.util.Queue;

public class GuerraDeNums {
    Queue<Integer> colaNums;

    public int diferenciaParImpar(int[] nums) {
        colaNums = new LinkedList<>();
        int par = 0, impar = 0;

        for (int i = 0; i < nums.length; i++) 
            colaNums.add(nums[i]);
        
        int tam = colaNums.size();
        for (int i = 0; i < tam; i++) {
            int num = colaNums.poll();
            if (num % 2 == 0)
                par += num;
            else
                impar += num;

        }
        return Math.abs(impar - par);
    }
}
