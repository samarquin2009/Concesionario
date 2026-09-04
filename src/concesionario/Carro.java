/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario;

/**
 *
 * @author USUARIO
 */
public class Carro {
    private String Marca;
    private int AñoDeFabricacion;
    private double Precio;
    private boolean EsImportado;
    
    public Carro(){
        this.AñoDeFabricacion=0;
        this.EsImportado=true;
        this.Marca="";
        this.Precio=0;
    }
    
    public Carro(String Marca){
        this.Marca = Marca;
    }
    
    public Carro(String Marca,int AñoDeFabricacion){
        this.Marca = Marca;
        this.AñoDeFabricacion = AñoDeFabricacion;
    }
    
    public Carro(String Marca,int AñoDeFabricacion,double Precio){
        this.Marca = Marca;
        this.AñoDeFabricacion = AñoDeFabricacion;
        this.Precio = Precio;
    }
    public Carro(String Marca,int AñoDeFabricacion,double Precio,boolean EsImportado){
        this.Marca = Marca;
        this.AñoDeFabricacion = AñoDeFabricacion;
        this.Precio = Precio;
        this.EsImportado = EsImportado;
    }
    
    public String getMarca(){
        return Marca;
    }
    public void setMarca(String Marca){
    this.Marca = Marca;
    }
    public int getAñoDeFabricacion(){
        return AñoDeFabricacion;
    }
    public void setAñoDeFabricacion(int AñoDeFabricacion){
    this.AñoDeFabricacion = AñoDeFabricacion;
    }
    public double getPrecio(){
        return Precio;
    }
    public void setPrecio(double Precio){
    this.Precio = Precio;
    }
    public boolean getEsImportado(){
        return EsImportado;
    }
    public void setEsImportado(boolean EsImportado){
    this.EsImportado= EsImportado;
    }
    public void Encender(){
            System.out.println("Encendido de vehiculo");
}
    public void Apagar(){
        System.out.println("Detener el cvehiculo");
    }
}
