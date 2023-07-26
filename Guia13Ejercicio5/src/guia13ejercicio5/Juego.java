
package guia13ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego {

    private int numeroaleatorio = (int) ((Math.random() * 500) + 1);

    public Juego() {
    }

    public void iniciarJuego() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Bienvenido! Vamos a jugar");
        System.out.println("-------------------------");
        boolean jugando = true;
        int numAdivinado = 0;
        int contador = 0;
        while (jugando) {
            System.out.println("Introduzca un número del 1 al 500");
            try {
                numAdivinado = leer.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Que clase de números es ese??");
                System.out.println("Ahora no juegas más");
//                leer.next();   //Por si deseas seguir jugando, descomenta esta linea y comenta el booleano de la siguiente linea
                jugando = false;
            } 
            contador++;
            if (numAdivinado == numeroaleatorio) {
                System.out.println("GANASTE!!!!");
                jugando = false;
                System.out.println("La cantidad de intentos que tuviste que hacer fue de: " + contador);
            } 
            if (numAdivinado > numeroaleatorio) {
                System.out.println("Es mas chiquito...");
            } 
            if (numAdivinado < numeroaleatorio && numAdivinado != 0) {
                System.out.println("Es mas grande...");
            }
        }
    }
}
