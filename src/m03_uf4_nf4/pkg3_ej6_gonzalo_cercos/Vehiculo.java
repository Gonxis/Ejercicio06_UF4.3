/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

/**
 *
 * @author Gonxi's
 */
public abstract class Vehiculo {

    private String matricula;
    private int dias_alquiler;
    private int precio_dia = 50;
    protected double precio_alquiler;

    public abstract double CalcularPrecio ();

}
