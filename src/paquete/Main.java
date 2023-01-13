
package paquete;


public class Main {
   
  
    
    public static void main(String[] args) {
        
      
        Lanzadera nave1 = new Lanzadera(14, "ACPM", 700, 10, 20, "Apolo");
        nave1.tipo("tipoVehiculo");
        nave1.color("colorVehiculo");
        nave1.volar();
        nave1.aterrizar();
        nave1.mostrarDatos();
        
        
        Lanzadera nave2 = new Lanzadera(15, "GAS", 600, 12, 20, "Eagle");
        nave2.tipo("tipoVehiculo");
        nave2.color("colorVehiculo");
        nave2.volar();
        nave2.aterrizar();
        nave2.mostrarDatos();
        
        
        Lanzadera nave3 = new Lanzadera(9, "Propano", 450, 13, 23, "Lion");
        nave3.tipo("tipoVehiculo");
        nave3.color("colorVehiculo");
        nave3.volar();
        nave3.aterrizar();
        nave3.mostrarDatos();
        
        
        NaveNoTripulada vehiculo1 = new NaveNoTripulada(15, "Querosen", 800, 20, 30, "Rusev");
        vehiculo1.color("colorVehiculo");
        vehiculo1.tipo("tipoVehiculo");
        vehiculo1.volar();
        vehiculo1.aterrizar();
        vehiculo1.mostrarCaracteristicas();
        
        NaveNoTripulada vehiculo2 = new NaveNoTripulada(20, "Extra", 2000, 40, 20, "Aslam");
        vehiculo2.color("colorVehiculo");
        vehiculo2.tipo("tipoVehiculo");
        vehiculo2.volar();
        vehiculo2.aterrizar();
        vehiculo2.mostrarCaracteristicas();
        
        NaveNoTripulada vehiculo3 = new NaveNoTripulada(23, "Crudo", 1500, 34, 20, "Megan");
        vehiculo3.color("colorVehiculo");
        vehiculo3.tipo("tipoVehiculo");
        vehiculo3.volar();
        vehiculo3.aterrizar();
        vehiculo3.mostrarCaracteristicas();
        
        
        NaveTripulada espacial1 = new NaveTripulada(19, "Gasolina", 900, 17, 27, "Rakiu");
        espacial1.tipo("tipoVehiculo");
        espacial1.color("colorVehiculo");
        espacial1.volar();
        espacial1.aterrizar();
        espacial1.mostrarInformacion();
        
        NaveTripulada espacial2 = new NaveTripulada(22, "Gasolina", 100, 27, 29, "Arthur");
        espacial2.tipo("tipoVehiculo");
        espacial2.color("colorVehiculo");
        espacial2.volar();
        espacial2.aterrizar();
        espacial2.mostrarInformacion();
        
        NaveTripulada espacial3 = new NaveTripulada(25, "Extra", 240, 28, 32, "Brock");
        espacial3.tipo("tipoVehiculo");
        espacial3.color("colorVehiculo");
        espacial3.volar();
        espacial3.aterrizar();
        espacial3.mostrarInformacion();
 
    }
    
}
