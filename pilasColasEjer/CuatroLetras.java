package pilasColasEjer;

import java.util.Queue;

public class CuatroLetras {
    Queue<String> colaPalabras;
    Queue<String> colaFiltrada;

    public Queue<String> palabrasCuatroLetras(String[] palabras) {
        colaPalabras = new java.util.LinkedList<>();
        colaFiltrada = new java.util.LinkedList<>();

        for (int i = 0; i < palabras.length; i++) {
            colaPalabras.add(palabras[i]);
        }
        int tam = colaPalabras.size();
        for (int i = 0; i < tam; i++) {
            String palabra = colaPalabras.poll();
            if (palabra.length() == 4) {
                colaFiltrada.add(palabra);
            }
        }

        return colaFiltrada;
    }
}
