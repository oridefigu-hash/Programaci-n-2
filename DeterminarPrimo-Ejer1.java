//1) numero primo;
//comentar que hace el codigo y compararlo con el pseudocodigo
import java.util.Scanner; //importamos la clase Scanner para poder leer datos desde el teclado

public class DeterminarPrimo { //la clase DeterminarPrimo contiene el método main que determina si un número es primo o no, es publica y puede ser accedida desde otras clases

    public static void main(String[] args) { //el método main es el punto de entrada del programa y es público y estático, lo que significa que puede ser llamado sin crear una instancia de la clase

        Scanner teclado = new Scanner(System.in); //

        System.out.print("Ingrese un número entero: ");
        int numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("Error: el número no puede ser negativo");

        } else if (numero < 2) {
            System.out.println("El número no es primo");

        } else {
            boolean esPrimo = true;
            int divisor = 2;

            while (divisor < numero && esPrimo == true) {

                if (numero % divisor == 0) {
                    esPrimo = false;
                }

                divisor++;
            }

            if (esPrimo == true) {
                System.out.println("El número es primo");
            } else {
                System.out.println("El número no es primo");
            }
        }

        teclado.close();
    }
}
