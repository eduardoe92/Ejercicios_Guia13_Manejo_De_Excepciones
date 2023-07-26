
/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package guia13ejercicio3;

import java.util.Scanner;

public class Guia13Ejercicio3 {

    public static void main(String[] args) {

        divisionNumero();
    }

    public static void divisionNumero() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer numero");
        String num1 = leer.next();
        System.out.println("Ingrese el segundo numero");
        String num2 = leer.next();

        int int1 = Integer.parseInt(num1);
        int int2 = Integer.parseInt(num2);

        try {
            int divisionResultado = int1 / int2;
            System.out.println(divisionResultado);
        } catch (ArithmeticException e) {
            System.out.println("Division por cero");
        }
    }
}
