
package Main;

import Alojamiento.Alojamiento;
import Alojamiento.Camping;
import Alojamiento.Hotel;
import Alojamiento.Hotel4Estrellas;
import Alojamiento.Hotel5Estrellas;
import Alojamiento.Residencia;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        ArrayList <Alojamiento>listaAlojamientos = new ArrayList();
        
        int opcion=0;
        int opcion1=0;
        int opcion2=0;
        int opcion3=0;
        int opcion4=0;
        
        do {
            System.out.println("***SISTEMA DE PROMOCIONES TURÍSTICAS***");
            System.out.println("MENÚ");
            System.out.println("1-ALTA DE ALOJAMIENTO");
            System.out.println("2-CONSULTAS");
            System.out.println("3-SALIR");
            System.out.print("OPCIÓN:");
            opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("***ALTA DE ALOJAMIENTO***");
                    System.out.println("SELECCIONE OPCION A CREAR");
                    System.out.println("1-ALOJAMIENTO HOTELERO");
                    System.out.println("2-ALOJAMIENTO NO HOTELERO");
                    System.out.println("3-SALIR");
                    System.out.print("OPCION:");
                    opcion1=leer.nextInt();
                    
                    do {
                        switch (opcion1) {
                            case 1:
                                do {
                                    System.out.println("");
                                    System.out.println("***CREACIÓN DE HOTEL***");
                                    System.out.println("SELECCIONE TIPO DE HOTEL A CREAR");
                                    System.out.println("1-HOTEL 4 ESTRELLAS");
                                    System.out.println("2-HOTEL 5 ESTRELLAS");
                                    System.out.println("3-SALIR");
                                    System.out.print("OPCION:");
                                    opcion2=leer.nextInt();
                                    switch (opcion2) {
                                        case 1:
//                                          String nombre, String direccion, String localidad, String gerente, int pisos, int habitaciones, int camas, char gimnasio, int restaurante
                                            Hotel4Estrellas hotel4 = new Hotel4Estrellas();
                                            Hotel4Estrellas hotel5 = new Hotel4Estrellas();
                                            Hotel4Estrellas hotel6 = new Hotel4Estrellas();
                                            
                                            hotel4.crearHotel4Estrellas("MR HOTEL 4*", "Bulnes 345", "SAN MIGUEL", "Epifanía Gomez", 4, 5, 2, 'a', 3);
                                            hotel4.calcularHabitacion();
                                            listaAlojamientos.add(hotel4);   
                                            
                                            hotel5.crearHotel4Estrellas("SR HOTEL 4*", "Libertador 345", "CABA", "Jose Redzio", 3, 2, 1, 'b', 5);
                                            hotel5.calcularHabitacion();
                                            listaAlojamientos.add(hotel5);  
                                            
                                            hotel6.crearHotel4Estrellas("SARASA HOTEL 4*", "Moldes 355", "JOSE C. PAZ", "Victor Redzio", 6, 7, 1, 'a', 2);
                                            hotel6.calcularHabitacion();
                                            listaAlojamientos.add(hotel6);  
                                            break;
                                        case 2:
//                                          String nombre, String direccion, String localidad, String gerente, int pisos, int habitaciones, int camas, char gimnasio, int restaurante, int salones, int suites, int limosinas

                                            Hotel5Estrellas hotel1 = new Hotel5Estrellas();
                                            Hotel5Estrellas hotel2=new Hotel5Estrellas();
                                            Hotel5Estrellas hotel3=new Hotel5Estrellas();
                                            
                                            hotel1.crearHotel5Estrellas("BM HOTEL 5*", "Salguero 647", "CABA", "Bruno Redzio", 5, 4, 2, 'a', 3, 5, 4, 5);
                                            hotel1.calcularHabitacion();
                                            listaAlojamientos.add(hotel1);
                                            
                                            hotel2.crearHotel5Estrellas("RL HOTEL 5*", "Zubiaur 4511", "CABA", "Romina Lopez", 3, 2, 1, 'b', 5, 4, 1, 2);
                                            hotel2.calcularHabitacion();
                                            listaAlojamientos.add(hotel2);
                                            
                                            hotel3.crearHotel5Estrellas("MORA HOTEL 5*", "Zubiaur 4510", "CABA", "MORA LOPEZ", 10, 3, 2, 'a', 4, 2, 3, 6);
                                            hotel3.calcularHabitacion();
                                            listaAlojamientos.add(hotel3);
                                            break;
                                        case 3:
                                            break;
                                    }  
                                } while (opcion2!=3);
                                break;
                                
                            case 2:
                                do {
                                    System.out.println("");
                                    System.out.println("***CREACIÓN DE ALOJAMIENTO NO HOTELERO***");
                                    System.out.println("SELECCIONE OPCION");
                                    System.out.println("1-CAMPING");
                                    System.out.println("2-RESIDENCIA");
                                    System.out.println("3-SALIR");
                                    System.out.print("OPCION:");
                                    opcion3=leer.nextInt();;
                                    switch (opcion3) {
                                        case 1:
//                                          String nombre, String direccion, String localidad, String gerente, String privado, int metros, int carpas, int banios, String restaurante
                                            Camping camping = new Camping();
                                            Camping camping1 = new Camping();
                                            Camping camping2 = new Camping();
                                            
                                            
                                            camping.crearCamping("Camping Los Buenos Vecinos", "Colombres 485", "Tortuguitas", "Shazam Redzio", "si", 2, 3, 5, "si");
                                            listaAlojamientos.add(camping);
                                            
                                            camping1.crearCamping("Camping Machaca", "Viamonte 485", "Grand Bourg", "Clarita Redzio", "no", 4, 7, 8, "no");
                                            listaAlojamientos.add(camping1);
                                            
                                            camping2.crearCamping("Camping MonteLoco", "Sarasa 487", "Lomas de zamora", "Marcos Lopez", "si", 1, 2, 2, "si");
                                            listaAlojamientos.add(camping2);

                                            break;
                                        case 2:
//                                          String nombre, String direccion, String localidad, String gerente, String privado, int metros, int carpas, int banios, String restaurante, int habitaciones, String descuentos, String campo
                                            Residencia residencia = new Residencia();
                                            Residencia residencia1 = new Residencia();
                                            Residencia residencia2 = new Residencia();
                                            
                                            residencia.crearResidencia("Residencia LOQUITOS", "Bulnes 457", "Moreno", "Marcos Solis", "si", 2, 3, 4, "si", 9, "si", "si");
                                            listaAlojamientos.add(residencia);
                                            
                                            residencia1.crearResidencia("Residencia MARQUITO", "Saragosa 111", "Lanus", "Luis ventura", "no", 1, 1, 1, "no", 4, "no", "no");
                                            listaAlojamientos.add(residencia1);                                            
                                            
                                            residencia2.crearResidencia("Residencia Los viejos", "Monroe 457", "Martinez", "Villa Fiorito", "si", 7, 2, 1, "si", 4, "si", "no");
                                            listaAlojamientos.add(residencia2);                                            
                                            break;
                                        case 3:
                                            break;
                                    }  
                                } while (opcion3!=3);
                                
                                break;
                                
                            case 3:
                                break;
                    }
                    break;
                    } while (opcion1!=3);    
                    
                case 2:
                    do {
                        System.out.println("");
                        System.out.println("***CONSULTAS***");
                        System.out.println("SELECCIONE OPCION A CONSULTAR");
                        System.out.println("1-MOSTRAR TODOS LOS ALOJAMIENTOS");
                        System.out.println("2-MOSTRAR TODOS LOS HOTELES DE MÁS CAROS A MÁS BARATOS");
                        System.out.println("3-MOSTRAR TODOS LOS CAMPINGS CON RESTAURANTE");
                        System.out.println("4-MOSTRAR TODAS LAS RESIDENCIAS QUE TIENEN DESCUENTO");
                        System.out.println("5-SALIR");
                        System.out.print("OPCION:");
                        System.out.println("");
                        opcion4=leer.nextInt();
                        switch (opcion4) {
                            case 1:
                                System.out.println("");
                                System.out.println("***TODOS LOS ALOJAMIENTOS***");
                                for (Alojamiento a: listaAlojamientos) {
                                    System.out.println("NOMBRE:"+a.getNombre());
                                    System.out.println("----------------------");
                                }
                                break;
                            case 2:
                                System.out.println("***HOTELES ORDENADOS DE MAYOR A MENOR***");
                                Hotel hotel = new Hotel();
                                hotel.imprimirHotelesMayorMenor(listaAlojamientos);
                                break;
                            case 3:
                                System.out.println("***CAMPINGS CON RESTAURANTE***");
                                Camping camping = new Camping();
                                camping.imprimirCampingRestaurante(listaAlojamientos);
                                break;
                            case 4:
                                System.out.println("***RESIDENCIAS CON DESCUENTO***");
                                Residencia residencia = new Residencia();
                                residencia.residenciasDescuento(listaAlojamientos);
                                break;
                            case 5:
                                break;      
                        }
                    } while (opcion4!=5);
                case 3:
                        break;
            }  
        } while (opcion!=3);
        
        
        System.out.println("***FIN DE PROGRAMA***");
    }
}
