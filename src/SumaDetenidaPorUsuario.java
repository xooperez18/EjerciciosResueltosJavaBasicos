import java.util.Scanner;
/**
 * @autor Xochitl Perez Antonel
 * Ejercicio 8
 */

public class SumaDetenidaPorUsuario {
        public static void main(String[] args) {
            // Se declara el objeto de Scanner para la lectura de datos ingresados por consola
            Scanner scanner = new Scanner(System.in);
            int suma = 0;      // Acumula los números que son ingresados
            int contador = 0;  // Cuenta cuántos números se ingresaron
            String respuesta;  // Guarda la respuesta del usuario

            // Nos apoyamos con un do while
            do {
                // Pedir un número
                System.out.print("Ingresa un número: ");
                int num = scanner.nextInt();
                suma += num;
                contador++;

                // Preguntar si desea continuar
                System.out.print("¿Deseas ingresar otro número? (si/no): ");
                respuesta = scanner.next();
            } while (!respuesta.equalsIgnoreCase("no")); // Se repite mientras no escriba "no"

            // Mostrar resultados
            System.out.println("La suma total es: " + suma);
            System.out.println("Ingresaste " + contador + " números.");

            scanner.close();
        }
}
