/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

/**
 *
 * @author Gonxi's
 */
//Sub clase de Tranporte de personas, donde también nos interesa calcular el precio de su alquiler
public class Microbus extends TransportePersonas {

    protected int precioPlaza = 2;

    public Microbus(String matricula, int numPlazas) {
        super(numPlazas, matricula);
    }

    @Override
    public double calcular_precio_alquiler() {
        return this.dias_alquiler * this.precio_dia + this.precioPlaza * this.numPlazas;
    }
}
