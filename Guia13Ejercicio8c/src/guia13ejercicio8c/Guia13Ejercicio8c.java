
/*
Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
    class Tres {
    
        private static int metodo() {
            int valor = 0;
            try {
                valor = valor + 1;
                valor = valor + Integer.parseInt("W");
                valor = valor + 1;
                System.out.println("Valor final del try: " + valor
                 );
            } catch (NumberFormatException e) {
                    valor = valor + Integer.parseInt("W");
                    System.out.println("Valor final del catch: " + valor);
            }finally{
                    valor = valor + 1;
                    System.out.println("Valor final del finally: " + valor);
                }
                valor = valor + 1;
                System.out.println("Valor antes del return: " + valor);
            return valor;
            }

    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo()") ;
        e.printStackTrace();
        }
    }

 */
package guia13ejercicio8c;

public class Guia13Ejercicio8c {
    public static void main(String[] args) {
        Tres tres = new Tres();
        tres.main(args);
        
        // Debido a la excepción NumberFormatException, se muestra el mensaje de error en la consola
        // y no se llega a mostrar el valor antes del return.
    }
}



