import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
              Scanner leer = new Scanner(System.in);

        // Pedir los números al usuario
        System.out.print("Ingresa el primer número: ");
        double num1 = leer.nextDouble());

        System.out.print("Ingresa el segundo número: ");
        double num2 = leer.nextDouble();

        // Realizar las operaciones básicas
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;

        // Mostrar resultados en consola
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + multiplicacion);

        // Validación para evitar división por cero
        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("División: " + num1 + " / " + num2 + " = " + division);
        } else {
            System.out.println("División: No es posible dividir entre cero.");
        }

        leer.close(); // Buena práctica: cerrar el Scanner
    }
}