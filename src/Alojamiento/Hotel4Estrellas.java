
package Alojamiento;

public class Hotel4Estrellas extends Hotel{
    private char gimnasio;
    private String nombreRestaurant;
    private int capacidadRestaurant;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(char gimnasio, String nombreRestaurant, int capacidadRestaurant, int habitaciones, int camas, int pisos, int precio, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, precio, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public int getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(int capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }
    
        public void crearHotel4Estrellas(String nombre, String direccion, String localidad, String gerente, int pisos, int habitaciones, int camas, char gimnasio, int restaurante){
        super.crearHotel(nombre, direccion, localidad, gerente, pisos, habitaciones, camas);
        this.setGimnasio(gimnasio);
        this.setCapacidadRestaurant(restaurante);
        
//        System.out.print("Ingresar tipo de gimnasio (a o b):");
//        this.setGimnasio(leer.next().charAt(0));
//        System.out.print("Ingresar capacidad de restaurante:");
//        this.setCapacidadRestaurant(leer.nextInt());

    }
    
    
    @Override
    public void calcularHabitacion() {
        super.calcularHabitacion(); 
        int precioHabitacion = 0;
        if (this.capacidadRestaurant<30) {
            this.setPrecio(this.getPrecio()+10);
        }else if (this.capacidadRestaurant>=30 && this.capacidadRestaurant<=50) {
            this.setPrecio(this.getPrecio()+30);
        }else{
            this.setPrecio(this.getPrecio()+50);
        }
        if (this.getGimnasio()=='a') {
            this.setPrecio(this.getPrecio()+50);
        }else{
            this.setPrecio(this.getPrecio()+30);
        }
        
        System.out.println("PRECIO HABITACION:"+this.getPrecio());
    }
}
