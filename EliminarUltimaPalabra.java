import java.util.Scanner;

public class EliminarUltimaPalabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = sc.nextLine().trim(); // Quita espacios al inicio y final

        String[] palabras = frase.split(" "); // Divide la frase en palabras

        if (palabras.length <= 1) {
            System.out.println("No hay suficiente contenido para eliminar.");
        } else {
            for (int i = 0; i < palabras.length - 1; i++) {
                System.out.print(palabras[i] + " ");
            }
        }
    }
}

