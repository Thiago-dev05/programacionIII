package pilasColasEjer;

import java.util.Stack;

public class CuadradosCubos {
    Stack<Integer> pilaNums;
    public boolean cuadradoEsCubo(int a, int b) {
        pilaNums = new Stack<>();
        pilaNums.push(a);
        pilaNums.push(b);

        // Implementación 1 (sin tolerancia)
        // int num1 = pilaNums.pop();
        // int num2 = pilaNums.pop();

        // if (Math.sqrt(num2) == Math.cbrt(num1)) {
        //     return true;
        // }
        // return false;

        // Implementación 2 (con tolerancia)
        int num2 = pilaNums.pop(); // b
        int num1 = pilaNums.pop(); // a

        double raizCuadrada = Math.sqrt(num1);
        double raizCubica = Math.cbrt(num2);

        return Math.abs(raizCuadrada - raizCubica) < 1e-6;
    }
}
