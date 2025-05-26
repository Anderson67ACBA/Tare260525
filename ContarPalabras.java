import java.util.Scanner;

public class ContarPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = sc.nextLine();

        // Quita espacios dobles o múltiples
        frase = frase.trim().replaceAll("\\s+", " ");
        String[] palabras = frase.split(" ");
        System.out.println("Cantidad de palabras: " + palabras.length);
    }
}
