import java.util.Scanner;

/**
 * @autor Xochitl Perez Antonel
 * Ejercicio 3
 */
public class NumeroPareImpar {
    public static void main(String[] args) {
            // Se declara el objeto de Scanner para leer datos por consola
        Scanner numeros = new Scanner(System.in);

        //Se le pide por consola un número al usuario
        System.out.print("Ingrese un número: ");
        int numero = numeros.nextInt();

        // Este if apoya a validar si es cero , par o impar , positivo y negativo

        if(numero == 0){
            System.out.print("El número es 0.");
        }else if (numero % 2 == 0){
            System.out.print("El número es par,");
        }else{
            System.out.print("El número es impar.");
        }
        if (numero > 0){
            System.out.print("El número es positivo.");
        }else{
            System.out.print("El número es negativo.");
        }
            //Se cierra -el objeto de Scanner
        numeros.close();
    }
}