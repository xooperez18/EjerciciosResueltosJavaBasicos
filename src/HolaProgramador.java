import java.util.Scanner;

/**
 * @author Xochitl Pérez Antonel
 * @Ejercicio1
 */
public class HolaProgramador {
    public static void main(String[] args) {

        // Se hace la declaración del objeto Scanner para poder leer los datos que se van
        //ingresas desde consola.
        Scanner consola = new Scanner(System.in);

        //Se le pide al usuario su nombre
        System.out.println("Ingresa tu nombre:" );
        String nombre = consola.nextLine();

        //Se le pide al usuario su edad
        System.out.println("Ingresa tu edad: ");
        int edad = consola.nextInt();

        // Se manda a llamar el método que miestra el mensaje
        mostrarMensaje(nombre, edad);

        //Se cierra el objeto de Scanner
        consola.close();


    }

    // Se realiza un método para mostrar el mensaje con el año de nacimiento
    public static void mostrarMensaje(String nombre, int edad){
        int anioActual = java.time.Year.now().getValue();
        int anioNacimiento = anioActual - edad;

        System.out.println("Hola "+ nombre + ". Tienes " + edad + " años. ¡Bienvenid@ a Java!, naciste en el año " + anioNacimiento);
    }
}