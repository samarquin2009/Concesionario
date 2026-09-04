/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario;

/**
 *
 * @author USUARIO
 */
public class SedanEjecutivo extends Carro{
    private int LongitudDelCarro;
    private String Materiales;
    private double NivelDeInsonorizacion;
    private boolean Electrico;
    
    public SedanEjecutivo(){
        super();//
        this.LongitudDelCarro=0;
        this.Materiales="";
        this.NivelDeInsonorizacion=0;
        this.Electrico=false;
    }
    public SedanEjecutivo(String Marca,int AñoDeFabricacion,double Precio,boolean EsImportado,int LongitudDelCarro,String Materiales,double NivelDeInsonorizacion,boolean Electrico){
        super(Marca,AñoDeFabricacion,Precio,EsImportado);//
        this.LongitudDelCarro=0;
        this.Materiales="";
        this.NivelDeInsonorizacion=0;
        this.Electrico=false;
    }
    public int getLongitudDelCarro(){
        return LongitudDelCarro;
    }
    public void setLongitudDelCarro(int LongitudDelCarro){
        this.LongitudDelCarro = LongitudDelCarro;
    }
    public String getMateriales(){
        return Materiales;
    }
    public void setMateriales(String Materiales){
        this.Materiales = Materiales;
    }
    public double getNivelDeInsonorizacion(){
        return NivelDeInsonorizacion;
    }
    public void setNivelDeInsonorizacion(double NivelDeInsonorizacion){
        this.NivelDeInsonorizacion = NivelDeInsonorizacion;
    }
    public boolean getElectrico(){
        return Electrico;
    }
    public void setElectrico(boolean Electrico){
        this.Electrico = Electrico;
    }
    public void Oficina(){
        System.out.println("oficina Movil");
    }
}
