/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

/**
 *
 * @author gonchicrcos
 */
public class Coche extends TransportePersonas {

    protected double precio = 1.5;
    
    public Coche (String matricula, int dias_alquiler, int Num_Plazas){
        super (matricula, dias_alquiler, Num_Plazas);
    }
    
    @Override
    public double calcular_precio (){
        this.precio_alquiler = (precio_alquiler * precio_dia) + (dias_alquiler * precio * Num_Plazas);
        return precio_alquiler;
    }
    
}
