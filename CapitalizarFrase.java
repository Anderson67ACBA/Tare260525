import java.util.Scanner;

public class CapitalizarFrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = sc.nextLine().toLowerCase();

        String[] palabras = frase.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                resultado.append(Character.toUpperCase(palabra.charAt(0)))
                         .append(palabra.substring(1)).append(" ");
            }
        }

        System.out.println("Frase capitalizada: " + resultado.toString().trim());
    }
}
