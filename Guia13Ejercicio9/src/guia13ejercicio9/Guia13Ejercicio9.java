
/*
Dado el método metodoC de la clase C, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?

    class C {

        void metodoC() throws TuException {
            sentencia_c1
            try {
                sentencia_c2 sentencia_c3
            } catch (MioException e) {
                sentencia_c4
            } catch (TuException e) {
                sentencia_c5
                throw (e)
            } finally sentencia_c6
       }    
    }
 */
package guia13ejercicio9;

public class Guia13Ejercicio9 {

    public static void main(String[] args) {

    }
}

/*
a) Si se produce la excepción MioException:

Se ejecuta la sentencia sentencia_c1.
Se produce la excepción MioException en alguna parte de las sentencias sentencia_c2 o sentencia_c3.
Se captura la excepción MioException en el bloque catch (MioException e).
Se ejecuta la sentencia sentencia_c4.
Se ejecuta la sentencia sentencia_c6 del bloque finally.
b) Si no se produce la excepción MioException:

Se ejecuta la sentencia sentencia_c1.
Se ejecutan las sentencias sentencia_c2 y sentencia_c3 sin lanzar ninguna excepción.
No se ejecuta el bloque catch (MioException e) ya que no se produjo la excepción MioException.
Se ejecuta la sentencia sentencia_c6 del bloque finally.
c) Si se produce la excepción TuException:

Se ejecuta la sentencia sentencia_c1.
Se ejecutan las sentencias sentencia_c2 y sentencia_c3 sin lanzar ninguna excepción.
Se produce la excepción TuException en alguna parte de las sentencias sentencia_c2 o sentencia_c3.
Se captura la excepción TuException en el bloque catch (TuException e).
Se ejecuta la sentencia sentencia_c5.
Se lanza nuevamente la excepción TuException con throw (e).
No se ejecuta la sentencia sentencia_c6 del bloque finally.

En resumen, las sentencias y el orden de ejecución dependen de si se produce una excepción y de qué tipo de 
excepción se produce. Las sentencias sentencia_c1, sentencia_c2 y sentencia_c3 siempre se ejecutan, mientras 
que las demás sentencias dependen de las excepciones que se lancen y se capturen. El bloque finally siempre se 
ejecuta, excepto en el caso de que se lance una excepción desde el bloque catch.
*/
