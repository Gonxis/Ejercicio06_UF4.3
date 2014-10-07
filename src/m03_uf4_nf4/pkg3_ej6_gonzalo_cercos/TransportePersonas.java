/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;


public abstract class TransportePersonas extends Vehiculo {

    protected int Num_Plazas;
    
    public TransportePersonas (String matricula, int dias_alquiler, int Num_Plazas){
        super (matricula, dias_alquiler);
        this.Num_Plazas = Num_Plazas;
    }
    
    protected int get_Num_Plazas(){
        return Num_Plazas;
    }
    
    protected void set_Num_Plazas (int Num_Plazas){
        this.Num_Plazas = Num_Plazas;
    }
}
