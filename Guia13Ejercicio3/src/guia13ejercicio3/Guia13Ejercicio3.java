
/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */

package guia13ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Guia13Ejercicio3 {

    public static void main(String[] args) {
        
        try {
            divisionNumero();
        } catch (ArithmeticException e) {
            System.out.println("Division por cero");
        } catch (InputMismatchException i) {
            System.out.println("El valor ingresado no es un numero entero");
        } catch (NumberFormatException o) {
            System.out.println("El valor ingresado no es un numero valido");
        }
    }

    public static void divisionNumero() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = leer.nextInt();
        
        int divisionResultado = num1 / num2;
        System.out.println("El resultado de la division es: " + divisionResultado);
    }
}
