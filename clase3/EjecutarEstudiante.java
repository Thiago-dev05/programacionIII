public class EjecutarEstudiante{
    public static void main(String[] args) {
        //creación de los objetos

        Estudiante objEst1 = new Estudiante(1, 12345678, "Marcelo", "Comunicación Social");
        Estudiante objEst2 = new Estudiante(2, 11122233, "Kilito", "Diseño Visual");
        Estudiante objEst3 = new Estudiante(3, 12131415, "El Bryan", "Chef");
        String[] cursos1 = new String[]{"Periodismo", "Fotografia"};
        String[] cursos2 = new String[]{"Dibujo", "Animación"};

        // System.out.println(objEst1);

        //creación del arreglo de objetos (Estudiante)
        Estudiante[] est = new Estudiante[3];
        est[0] = objEst1;
        est[1] = objEst2;
        est[2] = objEst3;

        //actividad independiente
        //implmentar el método matricular cursos para que cada estudiante pueda realizar dicha operación
        objEst1.matricularCursos(cursos1);
        objEst2.matricularCursos(cursos2);

        System.out.println(objEst1);
        
    }
}