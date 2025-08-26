import java.util.Arrays;

public class Estudiante {
    // atributos
    private int id;
    private int cedula;
    private String nombre;
    private String facultad;
    private String[] cursos;

    // constructor
    public Estudiante(int id, int cedula, String nombre, String facultad) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.facultad = facultad;
    }

    public void matricularCursos(String[] cursos) {
        this.cursos = cursos;
        System.out.println(nombre + "se matriculó en: " + Arrays.toString(cursos));
    }

    // método toString
    public String toString() {
        return "Estudiante: [ id: " + id + ", Cédula: " + cedula + ", Nombre: " + nombre + ", Facultad: " + facultad + ", Cursos: " + Arrays.toString(cursos) + " ]";
    }
    
}