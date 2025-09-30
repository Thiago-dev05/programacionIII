package pilasColasEjer;

import java.util.Queue;

public class FormatNumTelefonico {
    Queue<Integer> colaNums;

    public String formatearNumero(int[] nums) {
        if (nums.length != 10) 
            return "Numero invalido";

        colaNums = new java.util.LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            colaNums.add(nums[i]);
        }

        String numFormateado = "";

        int tam = colaNums.size();
        for (int i = 0; i < tam; i++) {
            if (i == 0) // 1
                numFormateado += "(" + colaNums.poll(); // "(1"
            else if (i == 2) // 
                numFormateado += colaNums.poll() + ") "; // "(123)"
            else if (i == 5) 
                numFormateado += colaNums.poll() + "-"; // "(123) 456-"
            else
                numFormateado += colaNums.poll(); // "(123) 456-7890"
        }

        return numFormateado;
    }
}
