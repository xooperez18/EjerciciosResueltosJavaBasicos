import java.util.Scanner;

/**
 * @author Xochitl Perez Antonel
 * Ejercicio 6
 */

public class TablaDeMultiplicar {

    public static void main(String[] args) {

        //Creación del objeto de Scanner para la lectura de datos desde la consola
        Scanner scanner = new Scanner(System.in);

        // Se pide un número al usuario para saber que tabla de multiplicar quiere
        System.out.println("Ingresa un número: ");
        int n = scanner.nextInt();

        //Se pide el límite de la tabla de multiplicar
        System.out.println("¿Hasta que número deseas que se muestre la tabla de multiplicar? ");
        int lim = scanner.nextInt();

        // Se genera la tabla de multiplicar y se muestra con apoyo de un for

        for (int i = 1; i<= lim; i++){
            System.out.println(n+ " x " + i + " = " + (n * i));
        }
        // Se cierra el objeto de Scanner
        scanner.close();
    }
}
