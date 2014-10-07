/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

/**
 *
 * @author Gonxi's
 */
public abstract class Vehiculo {

    private String matricula;
    protected int dias_alquiler;
    protected int precio_dia = 50;
    protected double precio_alquiler;

    public abstract double calcular_precio ();
    
    public Vehiculo (String matricula, int dias_alquiler){
        this.matricula = matricula;
        this.dias_alquiler = dias_alquiler;
    }
    
    protected String get_Matricula (){
        return matricula;
    }

    protected void set_Matricula (String matricula){
        this.matricula = matricula;
    }
    
    protected int get_dias_alquiler (){
        return dias_alquiler;
    }
    
    protected void set_dias_alquiler (int dias_alquiler){
        this.dias_alquiler = dias_alquiler;
    }
    
}
