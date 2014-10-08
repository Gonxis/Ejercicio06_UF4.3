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

    
    public Furgoneta (String matricula, int dias_alquiler, int PMA, int precios){
        super (matricula, dias_alquiler, PMA, precios);
    }
    
    @Override
    public double calcular_precio() {
        this.precio_alquiler = dias_alquiler * precio_dia + PMA * precios;
        return precio_alquiler;
    }
    
}
