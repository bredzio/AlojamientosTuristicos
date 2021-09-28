
package Alojamiento;

import java.util.Scanner;


public class Alojamiento {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
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
    
    public void crearAlojamiento(String nombre, String direccion, String localidad, String gerente){
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setLocalidad(localidad);
        this.setGerente(gerente);
        
//        System.out.print("Ingresar nombre de alojamiento:");
//        this.setNombre(leer.next());
//        System.out.print("Ingresar dirección:");
//        this.setDireccion(leer.next());
//        System.out.print("Ingresar localidad:");
//        this.setLocalidad(leer.next());
//        System.out.print("Ingresar nombre del gerente:");
//        this.setGerente(leer.next());
    }
   
    
}
