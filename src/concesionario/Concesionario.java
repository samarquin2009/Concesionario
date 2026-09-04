/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concesionario;

/**
 *
 * @author USUARIO
 */
public class Concesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SedanEjecutivo sedan = new SedanEjecutivo("Audi",2024,18000000.0,true,480,"Cuero Nappa",98.5,true);
        AutoDeportivo deportivo = new AutoDeportivo("Sport",'E',true,6000,"Lotus",2026,360000000,true);
        CamionetaSUV camioneta = new CamionetaSUV("Mercedes Benz",2024,30000000.0,true,true,2700,200,"CVT");
        
        System.out.println("Sedan Ejecutivo");
        System.out.println("La marca del sedan es:"+ sedan.getMarca());
        System.out.println("Los materiales de la cogineria es:"+ sedan.getMateriales());
        System.out.println("El año de fabricacion es:"+ sedan.getAñoDeFabricacion());
        System.out.println("El sedan es electrico:"+ sedan.getElectrico());
        System.out.println("El sedan es importado:"+ sedan.getEsImportado());
        System.out.println("Las longitudes del carro son:"+ sedan.getLongitudDelCarro());
        System.out.println("El nivel de insonorizacion del sedan es:"+ sedan.getNivelDeInsonorizacion());
        System.out.println("El precio del sedan es:"+ sedan.getPrecio());
        
        System.out.println("Camioneta SUV");
        System.out.println("La marca de la camioneta es:"+ camioneta.getMarca());
        System.out.println("El tipo de la transmicion de la camioneta es:"+ camioneta.getTipoDeTransmicion());
        System.out.println("La altura al piso de la camioneta es:"+ camioneta.getAlturaAlPiso());
        System.out.println("El año de fabricacion de la camioneta es de:"+ camioneta.getAñoDeFabricacion());
        System.out.println("La camioneta es 4x4:"+ camioneta.getCuatroXCuatro());
        System.out.println("La camioneta es importada:"+ camioneta.getEsImportado());
        System.out.println("La camioneta cuesta:"+ camioneta.getPrecio());
        System.out.println("La camioneta pesa:"+ camioneta.getpeso());
        
        System.out.println("Auto Deportivo");
        System.out.println("La marca del deportivo es:"+ deportivo.getMarca());
        System.out.println("El modo de manejo seleccionado es:"+ deportivo.getModoDeManejo());
        System.out.println("El deportivon es del año:"+ deportivo.getAñoDeFabricacion());
        System.out.println("El cilindraje del motor es de:"+ deportivo.getCilindraje());
        System.out.println("El deportivo es importado:"+ deportivo.getEsImportado());
        System.out.println("El precio del deportivo es de:"+ deportivo.getPrecio());
        System.out.println("El deportivo es un superdeportivo:"+ deportivo.getSuperDeportivo());
        System.out.println("El tipo de motor que tiene es de:"+ deportivo.getTipoDeMotor());
    }
    
}
