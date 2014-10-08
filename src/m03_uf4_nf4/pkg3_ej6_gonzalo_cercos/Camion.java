/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

/**
 *
 * @author Gonxi's
 */
//Sub clase de Transporte de carga, donde definimos otro atributo solo para esta clase, para poder hacer el cálculo del precio de su alquiler
public class Camion extends TransporteCarga {

    protected int precioFijo = 40;

    public Camion(String matricula, double PMA) {
        super(PMA, matricula);
    }
//Implementamos calcular precio para cada clase, en este caso, para Camion
    @Override
    public double calcular_precio_alquiler() {
        return (this.dias_alquiler * this.precio_dia + this.precioxPMA * this.PMA) + this.precioFijo;
    }
}
