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

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public void setDias_alquiler(int dias_alquiler) {
        this.dias_alquiler = dias_alquiler;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getDias_alquiler() {
        return dias_alquiler;
    }

    public abstract double calcular_precio_alquiler();
}
