import java.util.Scanner;

/**
 * @author Xochitl Perez Antonel
 * Ejercicio 5
 */
public class ContadorDeNumeros {


    public static void main(String[] args) {
        // Se declara el objeto de Scanner para leer datos por consola
        Scanner contador = new Scanner(System.in);

        //Se pide un número
        System.out.println("Ingresa un número N: ");
        int n = contador.nextInt();

        int suma = 0;

        // Se muestran los números del 1 al N y se acumula la suma con ayuda de un for
        for (int i = 1; i <= n; i++){
            System.out.println(i);
            suma +=i;
        }

        // Se muestra la suma total
        System.out.println("La suma total es: " + suma);

        //Se cierra el objeto de scanner
        contador.close();
    }

}
