import java.util.Scanner;

/**
 * @author  Xochitl Pérez Antonel
 * Ejercicio 2
 */
public class CalculadoraSimple {

    public static void main(String[] args) {

        //Creación del objeto de Scanner para la lectura de datos desde la consola
        Scanner calculador = new Scanner(System.in);

        //Se van a pedir los 2 números para realizar las operaciones aritméticas

        System.out.println("Ingresa el primer número: ");
        double num1 = calculador.nextDouble();
        System.out.println("Ingresa el segundo número: ");
        double num2 = calculador.nextDouble();

        //Se muestra un Menú para poder elegir la operación aritmética a realizar
        System.out.println("Elige la operación que deseas realizar: ");
        System.out.print("1.Suma\n2.Restar\n3.Multiplicar\n4.Dividir\n");

        // Se lee la opción que se elige del Menú
        int opcion = calculador.nextInt();

        //Se realiza un switch de la opción escogida para realizar la operación aritmética
        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: no se puede dividir entre 0.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
            // Se cierra el objeto de Scanner
            calculador.close();
    }
}
