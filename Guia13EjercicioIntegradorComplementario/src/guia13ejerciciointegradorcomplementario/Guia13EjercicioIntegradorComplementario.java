

/*
Este ejercicio va a requerir que utilicemos todos conocimientos previamente vistos en esta y otras
gu�as. Estos pueden realizarse cuando hayas terminado todas las gu�as y tengas una buena base
sobre todo lo que ven�amos trabajando. Adem�s, si ya terminaste la gu�a y te queda tiempo libre
en las mesas, podes continuar con este ejercicio complementario, recordando siempre que no es
necesario que los termines para continuar con el tema siguiente. Este ejercicio, no lleva nota y es
solamente para medir nuestros conocimientos. Por ultimo, record� que la prioridad es ayudar a
los compa�eros de la mesa y que cuando tengas que ayudar, lo m�s valioso es que puedas
explicar el ejercicio con la intenci�n de que tu compa�ero lo comprenda, y no s�lo mostrarlo.
�Muchas gracias!

ARMADURA IRON MAN:
J.A.R.V.I.S. es una inteligencia artificial desarrollada por Tony Stark. Est� programado para hablar
con voz masculina y acento brit�nico. Actualmente se encarga de todo lo relacionado con la
informaci�n dom�stica de su casa, desde los sistemas de calefacci�n y refrigeraci�n hasta los Hot
Rod que Stark tiene en su garage.
Tony Stark quiere adaptar a J.A.R.V.I.S. para que lo asista en el uso de sus armaduras, por lo tanto,
ser�s el responsable de llevar adelante algunas de estas tareas.
El objetivo de JARVIS es que analice intensivamente toda la informaci�n de la armadura y del
entorno y en base a esto tome decisiones inteligentes.
En este trabajo se deber� crear en el proyecto una clase llamada Armadura que modele toda la
informaci�n y las acciones que pueden efectuarse con la Armadura de Iron Man. La armadura de
Iron Man es un exoesqueleto mec�nico ficticio usado por Tony Stark cuando asume la identidad
de Iron Man. La primera armadura fue creada por Stark y Ho Yinsen, mientras estuvieron
prisioneros.
Las armaduras de Stark se encuentran definidas por un color primario y un color secundario. Se
encuentran compuestas de dos propulsored, uno en cada bota; y dos repulsores, uno en cada
guante (los repulsores se utilizan tambi�n como armas). Tony los utiliza en su conjunto para volar.
La armadura tiene un nivel de resistencia, que depende del material con el que est� fabricada, y
se mide con un n�mero entero cuya unidad de medida de dureza es Rockwell
(https://es.wikipedia.org/wiki/Dureza_Rockwell). Todas las armaduras poseen un nivel de salud el
cual se mide de 0 a 100. Adem�s, Tony tiene un generador, el cual le sirve para salvarle la vida en
cada instante de tiempo alejando las metrallas de metal de su coraz�n y tambi�n para alimentar
de energ�a a la armadura. La bater�a a pesar de estar en el pecho de Tony, es considerada como
parte de la armadura.
La armadura tambi�n posee una consola en el casco, a trav�s de la cual JARVIS le escribe
informaci�n a Iron Man. En el casco tambi�n se encuentra un sintetizador por donde JARVIS
susurra cosas al o�do de Tony. Cada dispositivo de la armadura de Iron Man (botas, guantes,
consola y sintetizador) tienen un consumo de energ�a asociado.
En esta primera etapa con una armadura podremos: caminar, correr, propulsar, volar, escribir y
leer.
? Al caminar la armadura har� un uso b�sico de las botas y se consumir� la energ�a
establecida como consumo en la bota por el tiempo en el que se camine.
? Al correr la armadura har� un uso normal de las botas y se consumir� el doble de la
energ�a establecida como consumo en la bota por el tiempo en el que se corra.

? Al propulsarse la armadura har� un uso intensivo de las botas utilizando el triple de la
energ�a por el tiempo que dure la propulsi�n.
? Al volar la armadura har� un uso intensivo de las botas y de los guantes un uso normal
consumiendo el triple de la energ�a establecida para las botas y el doble para los guantes.
? Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo.
? Al utilizar las botas para caminar o correr el consumo es normal durante el tiempo que se
camina o se corra.
? Cada vez que se escribe en la consola o se habla a trav�s del sintetizador se consume lo
establecido en estos dispositivos. Solo se usa en nivel b�sico.
? Cada vez que se efect�a una acci�n se llama a los m�todos usar del dispositivo se le pasa
el nivel de intensidad y el tiempo. El dispositivo debe retornar la energ�a consumida y la
armadura deber� informar al generador se ha consumido esa cantidad de energ�a.
Modele las clases, los atributos y los m�todos necesarios para poder obtener un modelo real de la
armadura y del estado de la misma.
Mostrando Estado
Hacer un m�todo que JARVIS muestre el estado de todos los dispositivos y toda la informaci�n de
la Armadura.
Estado de la Bater�a
Hacer un m�todo para que JARVIS informe el estado de la bater�a en porcentaje a trav�s de la
consola. Poner como carga m�xima del reactor el mayor float posible. Ejecutar varias acciones y
mostrar el estado de la misma.
Mostrar Informaci�n del Reactor
Hacer un m�todo para que JARVIS informe el estado del reactor en otras dos unidades de
medida. Hay veces en las que Tony tiene pretensiones extra�as. Buscar en Wikipedia la tabla de
transformaciones.
Sufriendo Da�os
A veces los dispositivos de la armadura sufren da�os para esto cada dispositivo contiene un
atributo p�blico que dice si el dispositivo se encuentra da�ado o no. Al utilizar un dispositivo
existe un 30% de posibilidades de que se da�e.
La armadura solo podr� utilizar dispositivos que no se encuentren da�ados.
Modifique las clases que sean necesarias para llevar adelante este comportamiento.
Reparando Da�os
Hay veces que se puede reparar los da�os de un dispositivo, en general es el 40% de las veces
que se puede hacer. Utilizar la clase Random para modelar este comportamiento. En caso de estar
dentro de la probabilidad (es decir probabilidad menor o igual al 40%) marcar el dispositivo como
sano. Si no dejarlo da�ado.
Revisando Dispositivos
Los dispositivos son revisados por JARVIS para ver si se encuentran da�ados. En caso de
encontrar un dispositivo da�ado se debe intentar arreglarlo de manera insistente. Para esos
intentos hay un 30% de posibilidades de que el dispositivo quede destruido, pero se deber�
intentar arreglarlo hasta que lo repare, o bien hasta que quede destruido.

Hacer un m�todo llamado revisar dispositivos que efect�e lo anteriormente descrito, el
mecanismo insistente debe efectuarlo con un bucle do while.
Radar Versi�n 1.0
JARVIS posee tambi�n incorporado un sistema que usa ondas electromagn�ticas para medir
distancias, altitudes, ubicaciones de objetos est�ticos o m�viles como aeronaves barcos,
veh�culos motorizados, formaciones meteorol�gicas y por su puesto enemigos de otro planeta.
Su funcionamiento se basa en emitir un impulso de radio, que se refleja en el objetivo y se recibe
t�picamente en la misma posici�n del emisor.
Las ubicaciones de los objetos est�n dadas por las coordenadas X, Y y Z. Los objetos pueden ser
marcados o no como hostiles. JARVIS tambi�n puede detectar la resistencia del objeto, y puede
detectar hasta 10 objetos de manera simult�nea.
JARVIS puede calcular la distancia a la que se encuentra cada uno de los objetos, para esto
siempre considera que la armadura se encuentra situada en la coordenada (0,0,0).
Hacer un m�todo que informen a qu� distancia se encuentra cada uno de los enemigos. Usar la
clase Math de Java.
Simulador
Hacer un m�todo en JARVIS que agregue en radar objetos, hacer que la resistencia, las
coordenadas y la hostilidad sean aleatorios utilizando la clase random. Utilizar la clase Random.
�Qu� ocurre si quiero a�adir m�s de 10 objetos?
�Qu� ocurre si cuando llevo 8 enemigos aumento la capacidad del vector?
Destruyendo Enemigos
Desarrollar un m�todo para que JARVIS que analice todos los objetos del radar y si son hostiles
que les dispare. El alcance de los guantes es de 5000 metros, si el objeto se encuentra fuera de
ese rango no dispara.
JARVIS al detectar un enemigo lo atacar� hasta destruirlo, la potencia del disparo es inversamente
proporcional a la distancia al a que se encuentra el enemigo y se descontar� de la resistencia del
enemigo. El enemigo se considera destruido si su resistencia es menor o igual a cero.
JARVIS solo podr� disparar si el dispositivo est� sano y si su nivel de bater�a lo permite. Si tiene
los dos guantes sanos podr� disparar con ambos guantes haciendo m�s da�o. Resolver utilizando
un for each para recorrer el arreglo y un while para destruir al enemigo.
Acciones Evasivas
Desarrollamos un m�todo para que JARVIS que analice todos los objetos del radar y si son
hostiles que les dispare. Modificar ese m�todo para que si el nivel de bater�a es menor al 10% se
corten los ataques y se vuelve lo suficientemente lejos para que el enemigo no nos ataque.
Deber�amos alejarnos por lo menos 10 km enemigo. Tener en cuenta que la velocidad de vuelo
promedio es de 300 km / hora.
*/

package guia13ejerciciointegradorcomplementario;


public class Guia13EjercicioIntegradorComplementario {

  
    public static void main(String[] args) {
        
    }

}
