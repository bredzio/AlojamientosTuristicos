
package Alojamiento;

import java.util.ArrayList;


public class Residencia extends ExtraHotel{
    private int cantidadHabitaciones;
    private String descuentosGremios;
    private String campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantidadHabitaciones, String descuentosGremios, String campoDeportivo, String privado, int metros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros, nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public String getDescuentosGremios() {
        return descuentosGremios;
    }

    public void setDescuentosGremios(String descuentosGremios) {
        this.descuentosGremios = descuentosGremios;
    }

    public String getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(String campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
    
    public void crearResidencia(String nombre, String direccion, String localidad, String gerente, String privado, int metros, int carpas, int banios, String restaurante, int habitaciones, String descuentos, String campo){
        super.crearExtraHotel(nombre, direccion, localidad, gerente, privado, metros);
        this.setCantidadHabitaciones(habitaciones);
        this.setDescuentosGremios(descuentos);
        this.setCampoDeportivo(campo);
        
//        System.out.print("Ingresar cantidad de habitaciones:");
//        this.setCantidadHabitaciones(leer.nextInt());
//        System.out.print("Ingresar si realizan descuentos a gremios(si o no):");
//        this.setDescuentosGremios(leer.next());
//        System.out.print("Ingresar si posee campo deportivo (si o no):");
//        this.setCampoDeportivo(leer.next());
    }
    
    public void residenciasDescuento(ArrayList<Alojamiento> listaAlojamientos){
        ArrayList<Residencia> listaResidencias = new ArrayList();
        
        for (Alojamiento a: listaAlojamientos) {
            if (a instanceof Residencia) {
                listaResidencias.add((Residencia) a);
            }
        }
        
        for (Residencia a:listaResidencias) {
            if (a.getDescuentosGremios().equals("si")) {
                System.out.println(a.getNombre());
            }
        }
    }
}
