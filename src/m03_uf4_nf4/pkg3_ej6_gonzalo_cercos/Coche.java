/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

/**
 *
 * @author Gonxi's
 */
//Sub clase de Transporte de personas, un coche, donde implementamos "calcular precio"
public class Coche extends TransportePersonas {

    protected double precioPlazaDia = 1.5;

    public Coche(String matricula, int numPlazas) {
        super(numPlazas, matricula);
    }

    @Override
    public double calcular_precio_alquiler() {
        
        return this.precio_dia * this.dias_alquiler + precioPlazaDia * this.dias_alquiler * this.numPlazas; 

    }
    
    
    
}
