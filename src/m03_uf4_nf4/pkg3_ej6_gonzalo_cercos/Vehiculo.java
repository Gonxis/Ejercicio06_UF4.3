/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

/**
 *
 * @author Gonxi's
 */
//Super clase del programa
public abstract class Vehiculo {

    private String matricula;
    protected int dias_alquiler;
    protected int precio_dia = 50;

    protected Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    protected void setDias_alquiler(int dias_alquiler) {
        this.dias_alquiler = dias_alquiler;
    }

    protected String getMatricula() {
        return matricula;
    }

    protected int getDias_alquiler() {
        return dias_alquiler;
    }

    public abstract double calcular_precio_alquiler();
}
