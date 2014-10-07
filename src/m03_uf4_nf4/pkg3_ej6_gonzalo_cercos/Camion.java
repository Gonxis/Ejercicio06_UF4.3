/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

/**
 *
 * @author gonchicrcos
 */
public class Camion extends TransporteCarga {

    protected int precio = 40;
    
    public Camion (String matricula, int precio_alquiler, int PMA, int precios){
        super (matricula, precio_alquiler, precios, PMA);
    }
    
    @Override
    public double calcular_precio() {
        this.precio_alquiler = precio_alquiler + precio;
        return precio_alquiler;
    }
    
}
