import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        String opcion;

        do {
            System.out.print("Ingrese un número: ");
            double num = sc.nextDouble();
            numeros.add(num);

            System.out.print("¿Desea ingresar otro número? (s/n): ");
            opcion = sc.next();
        } while(opcion.equalsIgnoreCase("s"));

        // Calcular promedio
        double suma = 0;
        int positivos = 0;
        for(double n : numeros) {
            suma += n;
            if (n > 0) positivos++;
        }
        double promedio = suma / numeros.size();

        System.out.println("Cantidad de números ingresados: " + numeros.size());
        System.out.println("Promedio: " + promedio);
        System.out.println("Cantidad de números positivos: " + positivos);
        
        sc.close();
    }
}
