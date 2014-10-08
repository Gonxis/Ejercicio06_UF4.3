/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Gonxi's
 */
public class Acciones {

    private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    private static ArrayList <Vehiculo> v;

    public static void leer_fichero() throws IOException {

        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fichero = new File("Vehiculos.txt");
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);

            String linea;
            if (v == null) {
                v = new ArrayList();
            }
            while ((linea = br.readLine()) != null) {
                String[] flota = linea.split(";");

                if (flota[3].equalsIgnoreCase("Coche")) {
                    v.add(new Coche(flota[0], Integer.parseInt(flota[1]))); //matricula, numPlazas
                } else if (flota[2].equalsIgnoreCase("Microbus")) {
                    v.add(new Microbus(flota[0], Integer.parseInt(flota[1]))); //matricula, numPlazas
                } else if (flota[2].equalsIgnoreCase("Furgoneta")) {
                    v.add(new Furgoneta(flota[0], Integer.parseInt(flota[1]))); //matricula, PMA
                } else if (flota[2].equalsIgnoreCase("Camión")) {
                    v.add(new Camion(flota[0], Integer.parseInt(flota[1]))); //matricula, PMA
                }
            }
            fr.close();

        } catch (Exception e) {
            System.out.println("Error en la lectura del fichero");
            System.out.println("");
        }
    }
}
