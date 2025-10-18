import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {

        // Se declara el objeto de Scanner para leer los datos que se ingresan desde consola
        Scanner sc = new Scanner(System.in);
        int opcion; // Variable que guarda la opción del menú

        // Menú que se repite hasta que el usuario elija salir
        do {
            System.out.println("\n--- MENÚ INTERACTIVO ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            // Si elige una operación válida (1,2,3), pedimos los números
            if (opcion >= 1 && opcion <= 3) {
                System.out.print("Ingresa el primer número: ");
                double num1 = sc.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                double num2 = sc.nextDouble();

                // Realizamos la operación seleccionada
                switch (opcion) {
                    case 1 -> System.out.println("Resultado: " + (num1 + num2));
                    case 2 -> System.out.println("Resultado: " + (num1 - num2));
                    case 3 -> System.out.println("Resultado: " + (num1 * num2));
                }
            } else if (opcion != 4) {
                // Si la opción no es válida y no es "salir"
                System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (opcion != 4); // Repite mientras no elija salir

        System.out.println("Gracias por usar el programa. ¡Adiós!");
        sc.close();
    }
}
