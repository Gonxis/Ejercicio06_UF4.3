/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

/**
 *
 * @author gonchicrcos
 */
public class Furgoneta extends TransporteCarga {

    
    public Furgoneta (String matricula, int dias_alquiler, int PMA, int precios){
        super (matricula, dias_alquiler, PMA, precios);
    }
    
    @Override
    public double calcular_precio() {
        return precio_alquiler;
    }
    
}
