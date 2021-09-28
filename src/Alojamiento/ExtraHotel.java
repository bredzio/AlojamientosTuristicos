
package Alojamiento;


public class ExtraHotel extends Alojamiento{
    private String privado;
    private int metros;

    public ExtraHotel() {
    }

    public ExtraHotel(String privado, int metros, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metros = metros;
    }

    public String getPrivado() {
        return privado;
    }

    public void setPrivado(String privado) {
        this.privado = privado;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }
    
    public void crearExtraHotel(String nombre, String direccion, String localidad, String gerente, String privado, int metros){
        super.crearAlojamiento(nombre, direccion, localidad, gerente);
        this.setPrivado(privado);
        this.setMetros(metros);
        
//        System.out.print("Ingresar si es privado (si o no):");
//        this.setPrivado(leer.next());
//        System.out.print("Ingresar cantidad de metros cuadrados que ocupa:");
//        this.setMetros(leer.nextInt());
    }
}
