/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

/**
 *
 * @author Gonxi's
 */

//Sub clase de Transporte de carga, con los atributos pasados de su Superclase ya podemos hacer el cálculo que nos piden
public class Furgoneta extends TransporteCarga {

    public Furgoneta(String matricula, double PMA) {
        super(PMA, matricula);
    }

    @Override
    public double calcular_precio_alquiler() {
        return this.dias_alquiler * this.precio_dia + this.precioxPMA * this.PMA;
    }

    
    
    
}
