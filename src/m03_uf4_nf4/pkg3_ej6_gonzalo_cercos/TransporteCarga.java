/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

/**
 *
 * @author Gonxi's
 */

//Sub clase de Vehiculo, donde definiremos algun otro atributo para sus próximas clases y cojeremos algún otro de la clase Vehiculo
public abstract class TransporteCarga extends Vehiculo {
    
    protected double PMA;
    protected int precioxPMA = 20;

    public TransporteCarga(double PMA, String matricula) {
        super(matricula);
        this.PMA = PMA;
    }

    public double getPMA() {
        return PMA;
    }

    public void setPMA(double PMA) {
        this.PMA = PMA;
    }
    
    
}
