import java.util.Scanner;

/**
 * @autor Xochitl Perez Antonel
 * Ejercicio 9
 */

public class AdivinaElNumero {

    public static void main(String[] args) {

        // Se declara el objeto de Scanner para leer los datos ingresados por consola

        Scanner sc = new Scanner(System.in);

        // Se genera el número aleatorio entre 1 y 50
        int numSecreto = (int) (Math.random() * 50 + 1);
        int intento; // esta variable es del número que el usuario va a ingresar por consola
        int intentos = 0; // Es el contador de intentos

        System.out.println("Adivina el número entre 1 y 50: ");

        // Se realiza un bucle hasta que acierte
        do {
            intento = sc.nextInt();
            intentos++;

            if (intento < numSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Correcto! Lo adivinaste en " + intentos + " intentos.");
            }
        } while (intento != numSecreto);

        sc.close();
    }


}
