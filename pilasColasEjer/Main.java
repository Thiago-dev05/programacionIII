package pilasColasEjer;

public class Main {
    public static void main(String[] args) {
        // COLAS
        // Pan Similar
        // String[] s1 = {"pan blanco", "lechuga", "pan blanco"};
        // String[] s2 = {"pan blanco", "tomate", "pan blanco"};
        // String[] s3 = {"pan integral", "lechuga", "pan blanco"};
        // PanSimilar objPan = new PanSimilar();
        // System.out.println("Los panes son similares? " + objPan.esPanSimilar(s1, s2));
        // System.out.println("Los panes son similares? " + objPan.esPanSimilar(s1, s3));

        // Formatear Número Telefónico
        int[] nums = {1,2,3,4,5,6,7,8,9,0};
        FormatNumTelefonico objFormat = new FormatNumTelefonico();
        System.out.println("Número formateado: " + objFormat.formatearNumero(nums));

        // // Sociedad Secreta
        // String[] nombres = {"Adam", "Sarah", "Malcolm"};
        // SociedadSecreta objSociedad = new SociedadSecreta();
        // System.out.println("Nombre de la sociedad secreta: " + objSociedad.formarSociedad(nombres));

        // // Palabras de Cuatro Letras
        // String[] palabras = {"Tomate", "Papa", "Par"};
        // String[] palabras2 = {"Luz", "Casa", "Sol", "Lago"};
        // CuatroLetras objCuatro = new CuatroLetras();
        // System.out.println("Palabras de cuatro letras: " + objCuatro.palabrasCuatroLetras(palabras));
        // System.out.println("Palabras de cuatro letras: " + objCuatro.palabrasCuatroLetras(palabras2));

        // // Guerra de números
        // int[] gNums = {2, 8, 7, 5};
        // int[] gNums2 = {1, 3, 5, 9};
        // GuerraDeNums objGuerra = new GuerraDeNums();
        // System.out.println("Diferencia entre impares y pares: " + objGuerra.diferenciaParImpar(gNums));
        // System.out.println("Diferencia entre impares y pares: " + objGuerra.diferenciaParImpar(gNums2));


        // PILAS
        // Cuadrados y Cubos
        CuadradosCubos objCuadCub = new CuadradosCubos();
        System.out.println("El cuadrado de a es igual al cubo de b? " + objCuadCub.cuadradoEsCubo(4, 8));
        System.out.println("El cuadrado de a es igual al cubo de b? " + objCuadCub.cuadradoEsCubo(16, 48));

        // COLA Y PILA
        // Segundo Más Grande
        int[] numeros = {10, 40, 30, 20, 50};
        SegundoMasGrande objSegMas = new SegundoMasGrande();
        System.out.println("El segundo número más grande es: " + objSegMas.segundoMasGrande(numeros));
    }
}
