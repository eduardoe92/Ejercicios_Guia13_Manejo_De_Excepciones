
/*
Escribir un programa en Java que juegue con el usuario a adivinar un n�mero. La computadora
debe generar un n�mero aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
n�mero que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indic�rselo e imprimir en pantalla el n�mero de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un n�mero, se debe
controlar esa excepci�n e indicarlo por pantalla. En este �ltimo caso tambi�n se debe contar el
car�cter fallido como un intento.
*/

package guia13ejercicio5;

public class Guia13Ejercicio5 {
  
    public static void main(String[] args) {
        
        Juego a = new Juego();

        a.iniciarJuego();
    }
}
