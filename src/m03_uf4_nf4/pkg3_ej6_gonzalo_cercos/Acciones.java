/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Gonxi's
 */

public class Acciones {
    
    private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    public static void cargardatos(ArrayList <Vehiculo> vehiculos) throws IOException {

        int voto = 0;


        /**
         * name = name.replace(name.charAt(0), (char) (name.charAt(0) - 32));
         * gendre = gendre.replace(gendre.charAt(0), (char) (gendre.charAt(0) -
         * 32)); description = description.replace(description.charAt(0), (char)
         * (description.charAt(0) - 32)); director =
         * director.replace(director.charAt(0), (char) (director.charAt(0)-32));
         */
        FileWriter archivo = null;
        PrintWriter pw = null;

        try {
            archivo = new FileWriter("Vehiculos.txt", true);
            pw = new PrintWriter(archivo);
//            pw.println(name + ";" + gendre + ";" + description + ";" + director + ";" + voto + ";");

            pw.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en la escritura del fichero");
        }

        System.out.println("");
        System.out.println("Process completed successfully");
        System.out.println("");

//Pasamos ahora a leer el fichero que acabamos de llenar        
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fichero = new File("Vehiculos.txt");
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);

            String linea;

            while ((linea = br.readLine()) != null) {
//                vehiculos.add(linea.split(";"));
            }
            fr.close();

        } catch (Exception e) {
            System.out.println("Error en la lectura del fichero");
        }
    }
}
