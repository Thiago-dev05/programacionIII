import java.util.Stack;

public class OperacionesPila {
    Stack<String> pilaSignos;
    
    public boolean validarParentesis(String[] s) {
        boolean flag = false;
        pilaSignos = new Stack<>();

        // Almacenar en la pila el arreglo de signos
        for (int i = 0; i < s.length; i++) {
            pilaSignos.push(s[i]);
        }

        int tan = pilaSignos.size();
        int c1 = 0, c2 = 0;

        // Recorrer la pila
        for (int i = 0; i < tan; i++) {
            if (pilaSignos.pop().equals("(")) {
                c1 += 1;
            } else
                c2 += 1;
        }

        flag = c1 == c2 ? true : false;

        return flag;
    }
}
