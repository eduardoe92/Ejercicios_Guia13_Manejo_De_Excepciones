
/*
Dado el método metodoA de la clase A, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
    class A {
        public void metodoA() {
            sentencia_a1
            sentencia_a2
                try {
                    sentencia_a3
                    sentencia_a4
                } catch (MioException e){
                        sentencia_a6
                    }
                        sentencia_a5
               }
            }               
 */
package guia13ejercicio6;

public class Guia13Ejercicio6 {

    public static void main(String[] args) {
        A objetoA = new A();
        objetoA.metodoA();
    }

    static class MioException extends Exception {
        // Código de la excepción MioException
    }

    static class A {

        public void metodoA() {
            int sentencia_a1 = 5; // Inicio de la ejecución del método: sentencia_a1 se inicializa con el valor 5.
            String sentencia_a2 = "Hola"; // sentencia_a2 se inicializa con el valor "Hola".

            System.out.println("Sentencia a3: " + sentencia_a1);

            System.out.println("Sentencia a3: " + sentencia_a2);

            try {
                int sentencia_a3 = sentencia_a1 + 10; // sentencia_a3 se calcula sumando 10 a sentencia_a1.
                System.out.println("Sentencia a3: " + sentencia_a1 + "+" + 10 + " = " + sentencia_a3);

                int sentencia_a4 = sentencia_a3 * 2; // sentencia_a4 se calcula multiplicando sentencia_a3 por 2.
                System.out.println("Sentencia a4: " + sentencia_a3 + "*" + 2 + " = " + sentencia_a4);

                // Aquí se produciría la excepción MioException.
                throw new MioException(); // Se lanza la excepción MioException y se sale del bloque try.
            } catch (MioException e) {
                // Si se produce la excepción MioException, se ejecuta esta parte del código:
                System.out.println("Se produjo una MioException"); // Se muestra el mensaje "Se produjo una MioException".
            }

            // Esta sentencia se ejecuta después del bloque catch, tanto si se produce la excepción como si no.
            System.out.println("Fin del metodo"); // Se muestra el mensaje "Fin del método".
        }
    }
}
