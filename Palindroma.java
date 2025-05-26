import java.util.Scanner;

public class Palindroma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("Ingresa una palabra:");
            String palabra = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

            String invertida = new StringBuilder(palabra).reverse().toString();

            if (palabra.equals(invertida)) {
                System.out.println("✅ La palabra es palíndroma.");
            } else {
                System.out.println("❌ La palabra NO es palíndroma.");
            }

            System.out.print("¿Deseas verificar otra palabra? (si/no): ");
            respuesta = sc.nextLine().toLowerCase();

        } while (respuesta.equals("si"));

        System.out.println("¡Quiero un 10 profe jajaja!");
    }
}
// Este programa verifica si una palabra ingresada por el usuario es un palíndromo.
