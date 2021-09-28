
package Alojamiento;


public class Hotel5Estrellas extends Hotel{
    private char gimnasio;
    private String nombreRestaurante;
    private int capacidadRestaurante;
    private int salonesDeConferencia;
    private int suites;
    private int limosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(char gimnasio, int capacidadRestaurante, int salonesDeConferencia, int suites, int limosinas, int habitaciones, int camas, int pisos, int precio, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, precio, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.capacidadRestaurante = capacidadRestaurante;
        this.salonesDeConferencia = salonesDeConferencia;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public int getSalonesDeConferencia() {
        return salonesDeConferencia;
    }

    public void setSalonesDeConferencia(int salonesDeConferencia) {
        this.salonesDeConferencia = salonesDeConferencia;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(int limosinas) {
        this.limosinas = limosinas;
    }
    
    
    public void crearHotel5Estrellas(String nombre, String direccion, String localidad, String gerente, int pisos, int habitaciones, int camas, char gimnasio, int restaurante, int salones, int suites, int limosinas){
        super.crearHotel(nombre, direccion, localidad, gerente, pisos, habitaciones, camas);
        this.setGimnasio(gimnasio);
        this.setCapacidadRestaurante(restaurante);
        this.setSalonesDeConferencia(salones);
        this.setSuites(suites);
        this.setLimosinas(limosinas);
        
        
//        
//        System.out.print("Ingresar tipo de gimnasio (a o b):");
//        this.setGimnasio(leer.next().charAt(0));
//        System.out.print("Ingresar capacidad de restaurante:");
//        this.setCapacidadRestaurante(leer.nextInt());
//        System.out.print("Ingresar cantidad de salones de conferencia:");
//        this.setSalonesDeConferencia(leer.nextInt());
//        System.out.print("Ingresar cantidad de suites:");
//        this.setSuites(leer.nextInt());
//        System.out.print("Ingresar cantidad de limosinas:");
//        this.setLimosinas(leer.nextInt());
    }
    
    
    @Override
    public void calcularHabitacion() {
        super.calcularHabitacion(); 
        int precioHabitacion = 0;
        if (this.capacidadRestaurante<30) {
            this.setPrecio(this.getPrecio()+10);
        }else if (this.capacidadRestaurante>=30 && this.capacidadRestaurante<=50) {
            this.setPrecio(this.getPrecio()+30);
        }else{
            this.setPrecio(this.getPrecio()+50);
        }
        if (this.getGimnasio()=='a') {
            this.setPrecio(this.getPrecio()+50);
        }else{
            this.setPrecio(this.getPrecio()+30);
        }
        
        int precioLimosinas = this.getLimosinas()*15;
        this.setPrecio(this.getPrecio()+precioLimosinas);
        System.out.println("PRECIO HABITACION:"+this.getPrecio());
    }
    
    
}
