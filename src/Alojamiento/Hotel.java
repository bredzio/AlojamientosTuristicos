
package Alojamiento;

import java.util.ArrayList;
import java.util.Comparator;


public class Hotel extends Alojamiento{
    private int habitaciones;
    private int camas;
    private int pisos;
    private Integer precio;

    public Hotel() {
    }

    public Hotel(int habitaciones, int camas, int pisos, Integer precio, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precio = precio;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
    public void crearHotel(String nombre, String direccion, String localidad, String gerente, int pisos, int habitaciones, int camas){
        super.crearAlojamiento(nombre, direccion, localidad, gerente);
        this.setPisos(pisos);
        this.setHabitaciones(habitaciones);
        this.setCamas(camas);
        
//        System.out.print("Ingresar cantidad de pisos:");
//        this.setPisos(leer.nextInt());
//        System.out.print("Ingresar cantidad de habitaciones:");
//        this.setHabitaciones(leer.nextInt());
//        System.out.print("Ingresar cantidad de camas:");
//        this.setCamas(leer.nextInt());
    }
    
    
    public void calcularHabitacion(){
        int precioHabitacion = 0;
        int capacidadHotel=this.getPisos()*this.getHabitaciones()*this.getCamas();
        precioHabitacion=50+(1*capacidadHotel);
        this.setPrecio(precioHabitacion);
    }
    
     
    public void imprimirHotelesMayorMenor(ArrayList<Alojamiento> listaAlojamiento){
         ArrayList<Hotel> listaHoteles = new ArrayList();
         
         for (Alojamiento a: listaAlojamiento) {
             if (a instanceof Hotel) {
                 listaHoteles.add(((Hotel) a));
             }
        }
        listaHoteles.sort(Hotel.compararHotel);
        
        for (Hotel h: listaHoteles) {
            System.out.println("NOMBRE:"+h.getNombre());
            System.out.println("PRECIO HABITACION:$"+h.getPrecio());
            System.out.println("----------------------");
        }
    }
    
    @Override
    public String toString() {
        return "Hotel{" + "habitaciones=" + habitaciones + ", camas=" + camas + ", pisos=" + pisos + ", precio=" + precio + '}';
        }
    
        public static Comparator<Hotel> compararHotel = new Comparator<Hotel>(){
        
        @Override
        public int compare(Hotel t, Hotel t1) {
            return t1.getPrecio().compareTo(t.getPrecio());
        }
        
    };
}
