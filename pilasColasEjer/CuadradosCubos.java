package pilasColasEjer;

import java.util.Stack;

public class CuadradosCubos {
    Stack<Integer> pilaNums;
    public boolean cuadradoEsCubo(int a, int b) {
        pilaNums = new Stack<>();
        pilaNums.push(a);
        pilaNums.push(b);

        int num1 = pilaNums.pop();
        int num2 = pilaNums.pop();

        if (Math.sqrt(num2) == Math.cbrt(num1)) {
            return true;
        }
        return false;
    }
}
