/**
 * @autor Xochitl Pérez Antonel
 * Ejercicio 7
 */

public class NumerosParesEntre1y100 {
    public static void main(String[] args) {

        // Se declara la variable del contador que se va a utilizar en el if
        int contador = 0;

        // Se hace el recorrido de los número del 1 al 100
        for (int i = 1; i <= 100; i++){
            // Se verifica si el número es par
            if(i % 2 == 0){
                System.out.print(i + " ");
                contador++;
            }
        }
        // Se muestra la  cantidad total de números pares
        System.out.println("\nTotal de números pares: " + contador);
    }
}
