import java.util.Scanner;

public class ContarVocalA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("Ingresa una frase:");
            String frase = sc.nextLine().toLowerCase();

            int contadorA = 0;

            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == 'a') {
                    contadorA++;
                }
            }

            System.out.println("La vocal 'a' aparece " + contadorA + " veces.");

            System.out.print("¿Deseas ingresar otra frase? (si/no): ");
            respuesta = sc.nextLine().toLowerCase();

        } while (respuesta.equals("si"));

        System.out.println("¡Quiero un 10 profe jajaja!");
    }
}

