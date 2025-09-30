package pilasColasEjer;

import java.util.Queue;

public class FormatNumTelefonico {
    Queue<Integer> colaNums;
    public String formatearNumero(int[] nums) {
        colaNums = new java.util.LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            colaNums.add(nums[i]);
        }
        String numFormateado = "";
        int tam = colaNums.size();
        for (int i = 0; i < tam; i++) {
            if (i == 0) {
                numFormateado += "(" + colaNums.poll();
            } else if (i == 2) {
                numFormateado += colaNums.poll() + ") ";
            } else if (i == 5) {
                numFormateado += colaNums.poll() + "-";
            } else
                numFormateado += colaNums.poll();
        }
        return numFormateado;
    }
}
