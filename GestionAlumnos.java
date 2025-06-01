import java.util.ArrayList;

public class GestionAlumnos {
 public static void main(String[] args) {
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    Alumno alumno1 = new Alumno("A001", "María López", "ML789");
        listaAlumnos.add(alumno1);
    Alumno alumno2 = new Alumno("A002", "Pedro", "ML789");
        listaAlumnos.add(alumno2);

    System.out.println("--- Lista de Alumnos ---");
    System.out.println(listaAlumnos);
    
 }
}
