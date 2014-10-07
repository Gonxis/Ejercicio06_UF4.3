/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

/**
 *
 * @author gonchicrcos
 */
public abstract class TransporteCarga extends Vehiculo {
    
    protected double PMA;
    protected int precios = 20;
    
    public TransporteCarga (String matricula, int dias_alquiler, int PMA, int precios){
        super (matricula, dias_alquiler);
        this.PMA = PMA;
       // this.precios = precios;
    }
    
    protected double get_PMA (){
        return PMA;
    }
    
    protected void set_PMA (double PMA){
        this.PMA = PMA;
    }
}
