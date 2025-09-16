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

        int tam = pilaSignos.size();
        int c1 = 0, c2 = 0;

        // Recorrer la pila
        for (int i = 0; i < tam; i++) {
            if (pilaSignos.peek().equals("(")) {
                c1 += 1;
            } else
                c2 += 1;

            pilaSignos.pop();
        }

        flag = c1 == c2 ? true : false;

        return flag;
    }
}
