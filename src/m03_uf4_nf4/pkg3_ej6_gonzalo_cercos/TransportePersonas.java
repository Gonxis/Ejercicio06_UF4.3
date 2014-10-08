/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

//Sub clase de Vehiculo donde le pasaremos los parametros matricula y dias de alquiler de Vehiculo
public abstract class TransportePersonas extends Vehiculo {

    protected int numPlazas;

    public TransportePersonas(int Num_Plazas, String matricula) {
        super(matricula);
        this.numPlazas = numPlazas;
    }

    public int getNum_Plazas() {
        return numPlazas;
    }
}
