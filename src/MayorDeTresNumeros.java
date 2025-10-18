import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

/**
 * @author Xochitl Perez Antonel
 * Ejercicio 4
 */
public class MayorDeTresNumeros {
    public static void main(String[] args) {

        // Se declara el objeto de Scanner para leer datos que se ingresan por consola
        Scanner numeros = new Scanner(System.in);

        // Se leen los 3 números a comprara
        System.out.print("Ingresa el primer número: ");
        int num1 = numeros.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = numeros.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int num3 = numeros.nextInt();

        //Para poder enocntrar el mayor se utiliza Math.max
        int mayor = Math.max(num1, Math.max(num2,num3));
        System.out.print("El número mayor es: " +  mayor);
        //Este if nos va ayudar si hay número iguales
        if(num1 == num2 || num1 == num3 || num2 == num3){
            System.out.print("\nHay número iguales.");
        }

            // Se cierra el Objeto de Scanner
        numeros.close();


    }

}
