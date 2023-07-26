
/*
Dado el m�todo metodoB de la clase B, indique:
a) �Qu� sentencias y en qu� orden se ejecutan si se produce la excepci�n MioException?
b) �Qu� sentencias y en qu� orden se ejecutan si no se produce la excepci�n MioException?
    class B {
        public void metodoB() {
            sentencia_b1
            try {
                sentencia_b2
            } catch (MioException e){
                sentencia_b3
            }
            finally
        sentencia_b4
        }
    }
 */
package guia13ejercicio7;

public class Guia13Ejercicio7 {

    public static void main(String[] args) {
        B objetoB = new B();
        objetoB.metodoB();
    }

    static class MioException extends Exception {
        // C�digo de la excepci�n MioException
    }

    static class B {

        public void metodoB() {
            int sentencia_b1 = 10; // Inicializaci�n de sentencia_b1 con un valor de 10

            try {
                // Aqu� va tu l�gica para sentencia_b2
                int sentencia_b2 = sentencia_b1 * 2; // Ejemplo de c�lculo: sentencia_b2 es el doble de sentencia_b1

                // Si se produce la excepci�n MioException en alguna sentencia anterior, se salta al bloque catch
                throw new MioException(); // Lanzamiento de la excepci�n MioException
            } catch (MioException e) {
                // Si se produce la excepci�n MioException, se ejecuta esta parte del c�digo
                System.out.println("Se produjo una MioException"); // Mensaje de salida
            } finally {
                // El bloque finally siempre se ejecuta, tanto si se produce la excepci�n como si no
                System.out.println("Bloque finally"); // Mensaje de salida
            }

            // Esta sentencia se ejecuta despu�s del bloque try-catch-finally
            System.out.println("Fin del metodo"); // Mensaje de salida
        }
    }
}
