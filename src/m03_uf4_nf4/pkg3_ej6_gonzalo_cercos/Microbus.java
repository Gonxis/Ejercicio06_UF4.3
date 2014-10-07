/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

/**
 *
 * @author gonchicrcos
 */
public class Microbus extends TransportePersonas {

    double precio = 1.5;
    int precio_plaza = 2;
    
    public Microbus (String matricula, int dias_alquiler, int Num_Plazas){
        super (matricula, dias_alquiler, Num_Plazas);
    }
    
    @Override
    public double calcular_precio (){
        this.precio_alquiler = (precio_alquiler * precio_dia) + (2*Num_Plazas);
        return precio_alquiler;
    }
    
}
