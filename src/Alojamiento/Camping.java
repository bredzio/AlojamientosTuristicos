
package Alojamiento;

import java.util.ArrayList;


public class Camping extends ExtraHotel{
    private int capacidadMaximaCarpas;
    private int baniosDisponibles;
    private String disponibilidadRestaurante;

    public Camping() {
    }

    public Camping(int capacidadMaximaCarpas, int baniosDisponibles, String disponibilidadRestaurante, String privado, int metros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros, nombre, direccion, localidad, gerente);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.baniosDisponibles = baniosDisponibles;
        this.disponibilidadRestaurante = disponibilidadRestaurante;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public void setCapacidadMaximaCarpas(int capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public int getBaniosDisponibles() {
        return baniosDisponibles;
    }

    public void setBaniosDisponibles(int baniosDisponibles) {
        this.baniosDisponibles = baniosDisponibles;
    }

    public String getDisponibilidadRestaurante() {
        return disponibilidadRestaurante;
    }

    public void setDisponibilidadRestaurante(String disponibilidadRestaurante) {
        this.disponibilidadRestaurante = disponibilidadRestaurante;
    }

    
    public void crearCamping(String nombre, String direccion, String localidad, String gerente, String privado, int metros, int carpas, int banios, String restaurante){
        super.crearExtraHotel(nombre, direccion, localidad, gerente, privado, metros);
        this.setCapacidadMaximaCarpas(carpas);
        this.setBaniosDisponibles(banios);
        this.setDisponibilidadRestaurante(restaurante);
           
//        System.out.print("Ingresar capacidad máxima de carpas:");
//        this.setCapacidadMaximaCarpas(leer.nextInt());
//        System.out.print("Ingresar cantidad de baños disponibles:");
//        this.setCapacidadMaximaCarpas(leer.nextInt());
//        System.out.print("Ingresar si posee restaurant (si o no):");
//        this.setDisponibilidadRestaurante(leer.next());
    }
    
    public void imprimirCampingRestaurante(ArrayList<Alojamiento> listaAlojamientos){
        ArrayList<Camping> listaConRestaurante = new ArrayList();
        
        for (Alojamiento a:listaAlojamientos) {
            if (a instanceof Camping) {
                listaConRestaurante.add((Camping) a);
            }
        }
        
        for (Camping c: listaConRestaurante) {
            if (c.getDisponibilidadRestaurante().equals("si")) {
                System.out.println(c.getNombre());
            }
        }
    }
}
