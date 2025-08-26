package clase4;

public class EjecutarLibro {
    public static void main(String[] args) {
        Libro[] libros = new Libro[3];
        libros[0] = new Libro("La historia del loco", "John Katzenbach", 35000);
        libros[1] = new Libro("El psicoanalista", "John Katzenbach", 75000);
        libros[2] = new Libro("El perfume", "Patrick S.", 48500);

        // System.out.println("Precio total de los libros: " + libros[0].calcularPrecioTotal(libros));
        // for (Libro libro : libros) {
        //     System.out.println(libro);
        // }

        libros[0].filtrarLibros(40000, libros);
    }
}
