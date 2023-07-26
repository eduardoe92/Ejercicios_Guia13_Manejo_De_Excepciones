package guia12extra3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Los alojamientos se identifican por un nombre, una dirección, una localidad y
 * un gerente encargado del lugar.
 *
 */
public class Alojamiento {

    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String nombre, direccion, localidad, gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }

    public void llenarAlojamiento() {

        System.out.println("Por favor introduzca el nombre del hotel");
        nombre = leer.next();
        System.out.println("Ahora la dirección");
        direccion = leer.next();
        System.out.println("la localidad");
        localidad = leer.next();
        System.out.println("Y por último el nombre del Gerente");
        gerente = leer.next();

    }

}

// Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas,
// * Cantidad de Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o
// * cinco estrellas. Las características de las distintas categorías son las
// * siguientes:
class Hoteles extends Alojamiento {

    protected int cantHabitaciones, numCamas, cantPisos, precioHabitaciones;

    public Hoteles() {
    }

    public Hoteles(int cantHabitaciones, int numCamas, int cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitaciones = 50;
    }

    public Hoteles(String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(int precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    @Override
    public String toString() {
        return "Hoteles{" + "cantHabitaciones=" + cantHabitaciones + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHabitaciones=" + precioHabitaciones + super.toString() + '}';
    }

    //cantHabitaciones, numCamas, cantPisos, precioHabitaciones;
    public void llenarHotel() throws InputMismatchException {
        super.llenarAlojamiento();
        System.out.println("Introduzca la cantidad de habitaciones que tiene el hotel");
        cantHabitaciones = leer.nextInt();
        System.out.println("El número de camas por habitación:");
        numCamas = leer.nextInt();
        System.out.println("La cantidad de pisos que posee:");
        cantPisos = leer.nextInt();
        precioHabitaciones = 50 + (cantPisos * cantHabitaciones * numCamas);
        
    }
}

// • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
// * Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Precio de las
// * Habitaciones.
class Hotel4 extends Hoteles {

    protected String gimnasio, nombreRest;
    protected int capRestaurant;

    public Hotel4() {
    }

    public Hotel4(String gimnasio, String nombreRest, int capRestaurant, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capRestaurant = capRestaurant;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

    public int getCapRestaurant() {
        return capRestaurant;
    }

    public void setCapRestaurant(int capRestaurant) {
        this.capRestaurant = capRestaurant;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "gimnasio=" + gimnasio + ", nombreRest=" + nombreRest + ", capRestaurant=" + capRestaurant + '}';
    }
// protected String gimnasio, nombreRest;
// protected int capRestaurant;

    public void llenarHotel4() {
        super.llenarHotel();
        System.out.println("El gimnasio es de tipo A o B ?");
        gimnasio = leer.next();
        System.out.println("introduzca el nombre del restaurant");
        nombreRest = leer.next();
        System.out.println("Cuantos comensales entran ?");
        capRestaurant = leer.nextInt();

        if (gimnasio.equalsIgnoreCase("A")) {
            precioHabitaciones += 50;
        } else {
            precioHabitaciones += 30;
        }

        if (capRestaurant < 30) {
            precioHabitaciones += 10;
        } else if (capRestaurant <= 50) {
            precioHabitaciones += 30;
        } else {
            precioHabitaciones += 50;
        }
    }

}

/**
 * • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
 * Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones
 * de Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las
 * Habitaciones.
 *
 */
class Hotel5 extends Hotel4 {

    protected int cantSalonesConf, cantLimo, cantSuite;

    public Hotel5() {
    }

    public Hotel5(int cantSalonesConf, int cantLimo, int cantSuite, String gimnasio, String nombreRest, int capRestaurant, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRest, capRestaurant, nombre, direccion, localidad, gerente);
        this.cantSalonesConf = cantSalonesConf;
        this.cantLimo = cantLimo;
        this.cantSuite = cantSuite;
    }

    public int getCantSalonesConf() {
        return cantSalonesConf;
    }

    public void setCantSalonesConf(int cantSalonesConf) {
        this.cantSalonesConf = cantSalonesConf;
    }

    public int getCantLimo() {
        return cantLimo;
    }

    public void setCantLimo(int cantLimo) {
        this.cantLimo = cantLimo;
    }

    public int getCantSuite() {
        return cantSuite;
    }

    public void setCantSuite(int cantSuite) {
        this.cantSuite = cantSuite;
    }

    @Override
    public String toString() {
        return "Hotel5{" + "cantSalonesConf=" + cantSalonesConf + ", cantLimo=" + cantLimo + ", cantSuite=" + cantSuite + '}';
    }

    public void llenarHotel5() {
        super.llenarHotel4();
        System.out.println("Introduzca cuantos salones de conferencia posee:");
        cantSalonesConf = leer.nextInt();
        System.out.println("la cantidad de limosinas a disposición:");
        cantLimo = leer.nextInt();
        System.out.println("Y por último la cantidad de suites:");
        cantSuite = leer.nextInt();
        precioHabitaciones += cantLimo * 15;
    }

}

//En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a
// * los de los hoteles, estando más orientados a la vida al aire libre y al
// * turista de bajos recursos. Por cada Alojamiento Extrahotelero se indica si es
// * privado o no, así como la cantidad de metros cuadrados que ocupa. Existen dos
// * tipos de alojamientos extrahoteleros: los Camping y las Residencias.
class ExtraHoteleros extends Alojamiento {

    protected boolean esPrivado;
    protected long metrosCuadrados;

    public ExtraHoteleros() {
    }

    public ExtraHoteleros(boolean esPrivado, long metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.esPrivado = esPrivado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isEsPrivado() {
        return esPrivado;
    }

    public void setEsPrivado(boolean esPrivado) {
        this.esPrivado = esPrivado;
    }

    public long getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(long metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "ExtraHoteleros{" + "esPrivado=" + esPrivado + ", metrosCuadrados=" + metrosCuadrados + '}';
    }
    
    public void llenarExtraHoteleros(){
        int privadochoice = (int) (Math.random() * 2 + 1);
        llenarAlojamiento();
        esPrivado = privadochoice == 1;
        System.out.println("Cuantos metros cuadrados tiene la parcela a ocupar ?");
        metrosCuadrados = leer.nextInt();
        
    }
}

//* Para los Camping se indica la capacidad máxima de carpas, la cantidad de
//* baños disponibles y si posee o no un restaurante dentro de las instalaciones.
class Camping extends ExtraHoteleros {

    protected int maxCarpas, numBanios;
    protected boolean restaurant;

    public Camping() {
    }

    public Camping(int maxCarpas, int numBanios, boolean restaurant, boolean esPrivado, long metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(esPrivado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.maxCarpas = maxCarpas;
        this.numBanios = numBanios;
        this.restaurant = restaurant;
    }

    public int getMaxCarpas() {
        return maxCarpas;
    }

    public void setMaxCarpas(int maxCarpas) {
        this.maxCarpas = maxCarpas;
    }

    public int getNumBanios() {
        return numBanios;
    }

    public void setNumBanios(int numBanios) {
        this.numBanios = numBanios;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Camping{" + "maxCarpas=" + maxCarpas + ", numBanios=" + numBanios + ", restaurant=" + restaurant + '}';
    }
}

// * Para las residencias se indica la cantidad de habitaciones, si se hacen o no
// * descuentos a los gremios y si posee o no campo deportivo.
// *
class Residencias extends ExtraHoteleros {

    protected int cantHabitaciones;
    protected boolean descGremio, poseeCampo;

    public Residencias() {
    }

    public Residencias(int cantHabitaciones, boolean descGremio, boolean poseeCampo, boolean esPrivado, long metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(esPrivado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descGremio = descGremio;
        this.poseeCampo = poseeCampo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescGremio() {
        return descGremio;
    }

    public void setDescGremio(boolean descGremio) {
        this.descGremio = descGremio;
    }

    public boolean isPoseeCampo() {
        return poseeCampo;
    }

    public void setPoseeCampo(boolean poseeCampo) {
        this.poseeCampo = poseeCampo;
    }

    @Override
    public String toString() {
        return "Residencias{" + "cantHabitaciones=" + cantHabitaciones + ", descGremio=" + descGremio + ", poseeCampo=" + poseeCampo + '}';
    }

}
