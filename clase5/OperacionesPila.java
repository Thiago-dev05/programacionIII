import java.util.Stack;

public class OperacionesPila {
    Stack<String> pilaSignos;
    
    public boolean validarParentesis(String[] s) {
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

        return c1 == c2 ? true : false;
        
        /*
         * TAREA: Implementar todos los métodos de la clase vector que son estos:
         * https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
         * Realice ejemplos prácticos para su funcionamiento
         */
    }
}
