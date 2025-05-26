import java.util.ArrayList;

public class ListaAlumnos {
    public static void main(String[] args) {
        ArrayList<Alumno> lista = new ArrayList<>();

        lista.add(new Alumno("001", "Ana Pérez", "A12345"));
        lista.add(new Alumno("002", "Luis Gómez", "B23456"));
        lista.add(new Alumno("003", "María López", "C34567"));

        for (Alumno a : lista) {
            System.out.println(a);
        }
    }
}
