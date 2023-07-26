
/*
Dado el método metodoB de la clase B, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
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
        // Código de la excepción MioException
    }

    static class B {

        public void metodoB() {
            int sentencia_b1 = 10; // Inicialización de sentencia_b1 con un valor de 10

            try {
                // Aquí va tu lógica para sentencia_b2
                int sentencia_b2 = sentencia_b1 * 2; // Ejemplo de cálculo: sentencia_b2 es el doble de sentencia_b1

                // Si se produce la excepción MioException en alguna sentencia anterior, se salta al bloque catch
                throw new MioException(); // Lanzamiento de la excepción MioException
            } catch (MioException e) {
                // Si se produce la excepción MioException, se ejecuta esta parte del código
                System.out.println("Se produjo una MioException"); // Mensaje de salida
            } finally {
                // El bloque finally siempre se ejecuta, tanto si se produce la excepción como si no
                System.out.println("Bloque finally"); // Mensaje de salida
            }

            // Esta sentencia se ejecuta después del bloque try-catch-finally
            System.out.println("Fin del metodo"); // Mensaje de salida
        }
    }
}
