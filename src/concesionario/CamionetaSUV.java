/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario;

/**
 *
 * @author USUARIO
 */
public class CamionetaSUV extends Carro{
    private boolean CuatroXCuatro;
    private int peso;
    private double AlturaAlPiso;
    private String TipoDeTransmicion;
    
    public CamionetaSUV(){
        super();//
        this.CuatroXCuatro=false;
        this.AlturaAlPiso=0;
        this.peso=0;
        this.TipoDeTransmicion="";
    }
    public CamionetaSUV(String Marca,int AñoDeFabricacion,double Precio,boolean EsImportado,boolean CuatroXCuatro,int peso,double AlturaAlPiso,String TipoDeTransmicion){
        super(Marca,AñoDeFabricacion,Precio,EsImportado);//
        this.CuatroXCuatro=false;
        this.AlturaAlPiso=0;
        this.TipoDeTransmicion="";
        this.peso=0;
    }
    public boolean getCuatroXCuatro(){
        return CuatroXCuatro;
    }
    public void setCuatroXCuatro(boolean CuatroXCuatro){
        this.CuatroXCuatro = CuatroXCuatro;
    }
    public int getpeso(){
        return peso;
    }
    public void setpeso(int peso){
        this.peso = peso;
    }
    public double getAlturaAlPiso(){
        return AlturaAlPiso;
    }
    public void setAlturaAlPiso(double AlturaAlPiso){
        this.AlturaAlPiso = AlturaAlPiso;
    }
    public String getTipoDeTransmicion(){
        return TipoDeTransmicion;
    }
    public void setTipoDeTransmicion(String TipoDeTransmicion){
        this.TipoDeTransmicion = TipoDeTransmicion;
    }
    public void ArrastreDeCamioneta(){
        System.out.println("Arrastrando toneladas");
    }
}
