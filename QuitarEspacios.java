import java.util.Scanner;

public class QuitarEspacios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una cadena:");
        String cadena = sc.nextLine();

        String sinEspacios = cadena.replaceAll("\\s+", "");
        System.out.println("Cadena sin espacios: " + sinEspacios);
    }
}
// Este programa elimina todos los espacios de una cadena ingresada por el usuario.