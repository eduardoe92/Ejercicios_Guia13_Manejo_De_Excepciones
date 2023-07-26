
/*
Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
    class Uno{
        private static int metodo() {
            int valor=0;
            try {
                valor = valor+1;
                valor = valor + Integer.parseInt ("42");
                valor = valor +1;
                System.out.println("Valor final del try: " + valor) ;
            } catch (NumberFormatException e) {
                Valor = valor + Integer.parseInt("42");
                System.out.println("Valor final del catch: " + valor);
            } finally {
                valor = valor + 1;
                System.out.println("Valor final del finally: " + valor) ;
            }
            valor = valor +1;
            System.out.println("Valor antes del return: " + valor) ;
            return valor;
            }

    public static void main (String[] args) {
        try {
            System.out.println (metodo()) ;
        }catch(Exception e) {
            System.err.println("Excepcion en metodo() ") ;
            e.printStackTrace();
            }
        }
    }
 */
package guia13ejercicio8a;

public class Guia13Ejercicio8a {
    
    public static void main(String[] args) {
        
        Uno uno = new Uno();
        uno.main(args);
    }
}
