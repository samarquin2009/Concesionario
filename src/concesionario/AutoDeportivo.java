/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario;

public class AutoDeportivo extends Carro{
    private String ModoDeManejo;
    private char TipoDeMotor;
    private int Cilindraje;
    private boolean SuperDeportivo;
    
    public AutoDeportivo(){
        super();//
        this.Cilindraje=0;
        this.ModoDeManejo="";
        this.SuperDeportivo=false;
        this.TipoDeMotor='E';
    }
    public AutoDeportivo(String ModoDeManejo,char TipoDeMotor,boolean SuperDeportivo,int Cilindraje,String Marca,int AñoDeFabricacion,double Precio,boolean EsImportado){
        super(Marca,AñoDeFabricacion,Precio,EsImportado);//
        this.Cilindraje=0;
        this.ModoDeManejo="";
        this.SuperDeportivo=false;
        this.TipoDeMotor='E';
    }
    public String getModoDeManejo(){
        return ModoDeManejo;
    }
    public void setModoDeManejo(String ModoDeManejo){
        this.ModoDeManejo = ModoDeManejo;
    }
    public char getTipoDeMotor(){
        return TipoDeMotor;
    }
    public void setTipoDeMotor(char TipoDeMotor){
        this.TipoDeMotor = TipoDeMotor;
    }
    public int getCilindraje(){
        return Cilindraje;
    }
    public void setCilindraje(int Cilindraje){
        this.Cilindraje = Cilindraje;
    }
    public boolean getSuperDeportivo(){
        return SuperDeportivo;
    }
    public void setSuperDeportivo(boolean SuperDeportivo){
        this.SuperDeportivo = SuperDeportivo;
    }
    public void Acelerar(){
        System.out.println("Aceleracion");
    }
    public void Freno(){
        System.out.println("Frenado ABS");
    }
}
