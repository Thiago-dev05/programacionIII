package clase4;

public class Libro {
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    // libro1 = {"360 dias", "autor1", 5000};
    public double calcularPrecioTotal(Libro[] libros) {
        double precioTotal = 0.0;
        for (int i = 0; i < libros.length; i++) 
            precioTotal += (double) libros[i].precio;

        return precioTotal;
    }

    public void filtrarLibros(double p, Libro[] libros) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].precio > p) 
                System.out.println(libros[i]);
        }
    }

    public String toString() {
        return "Titulo del libro: " + titulo + " - Autor: " + autor + " - Precio: " + precio;
    }
}
