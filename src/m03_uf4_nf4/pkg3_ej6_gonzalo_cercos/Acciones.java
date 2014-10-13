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
    private static ArrayList<Vehiculo> v;

// Añadimos matricula y num plazas en una lista
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

                if (flota[2].equalsIgnoreCase("Coche")) {
                    v.add(new Coche(flota[0], Integer.parseInt(flota[1]))); //matricula, numPlazas
                } else if (flota[2].equalsIgnoreCase("Microbus")) {
                    v.add(new Microbus(flota[0], Integer.parseInt(flota[1]))); //matricula, numPlazas
                } else if (flota[2].equalsIgnoreCase("Furgoneta")) {
                    v.add(new Furgoneta(flota[0], Integer.parseInt(flota[1]))); //matricula, PMA
                } else if (flota[2].equalsIgnoreCase("Camion")) {
                    v.add(new Camion(flota[0], Integer.parseInt(flota[1]))); //matricula, PMA
                } else{
                    continue;
                }
            }

            //A continuación se imprime la carga que hemos hecho
            for (int i = 0; i < v.size(); i++) {
                if (v.get(i) instanceof Coche) {
                    Coche a = (Coche) v.get(i);
                    System.out.println(a.matricula + ";" + a.dias_alquiler + ";" + a.numPlazas + ";Coche;");
                    
                } else if (v.get(i) instanceof Microbus) {
                    Microbus a = (Microbus) v.get(i);
                    System.out.println(a.matricula + ";" + a.dias_alquiler + ";" + a.numPlazas + ";Microbus;");
                    
                } else if (v.get(i) instanceof Furgoneta) {
                    Furgoneta a = (Furgoneta) v.get(i);
                    System.out.println(a.matricula + ";" + a.dias_alquiler + ";" + a.PMA + ";Furgoneta;");
                    
                } else {
                    Camion a = (Camion) v.get(i);
                    System.out.println(a.matricula + ";" + a.dias_alquiler + ";" + a.PMA + ";Camion;");
                }            
            }
            System.out.println("");
            fr.close();


            System.out.println("La carga de datos ha sido realizada con éxito");
            System.out.println("");

        } catch (Exception e) {
            System.out.println("Error en la lectura del fichero");
            System.out.println("");
        }

    }

    public static void AñadirVehiculo() throws IOException {
        byte op = 0;
        do {

            System.out.println("--------------- Tipo de vehículo ---------------");
            System.out.println(" ");
            System.out.println("1. Coche");
            System.out.println("2. Microbus");
            System.out.println("3. Furgoneta");
            System.out.println("4. Camión");
            System.out.println("5. Atrás");
            System.out.println(" ");
            System.out.println("------------------------------------------------");

            try {
                System.out.print("Escoja el tipo de vehículo que desea añadir ahora: ");
                String input = stdin.readLine();
                op = Byte.parseByte(input);
            } catch (Exception e) {
                System.out.println("");
                System.out.println("Tipo de variable incorrecta, se necesita un número entero del 1-5");

            }
            String matricula = "";
            int numPlazas = 0;
            double PMA = 0;
            switch (op) {
                // Coche
                case 1:
                    System.out.println("");
                    System.out.println("Coche");
                    System.out.println("");
                    System.out.print("Introduzca la matrícula del vehículo: ");
                    matricula = stdin.readLine();
                    System.out.print("Introduzca num. plazas del vehículo: ");
                    numPlazas = Integer.parseInt(stdin.readLine());
                    Coche c = new Coche(matricula, numPlazas);
                    v.add(c);

                    break;
                //Microbus
                case 2:
                    System.out.println("");
                    System.out.println("Microbus");
                    System.out.println("");
                    System.out.print("Introduzca la matrícula del vehículo: ");
                    matricula = stdin.readLine();
                    System.out.print("Introduzca num. plazas del vehículo: ");
                    numPlazas = Integer.parseInt(stdin.readLine());
                    Microbus m = new Microbus(matricula, numPlazas);
                    v.add(m);

                    break;
                //Furgoneta    
                case 3:
                    System.out.println("");
                    System.out.println("Furgoneta");
                    System.out.println("");
                    System.out.print("Introduzca la matrícula del vehículo: ");
                    matricula = stdin.readLine();
                    System.out.print("Introduzca PMA del vehículo: ");
                    PMA = Integer.parseInt(stdin.readLine());
                    Furgoneta f = new Furgoneta(matricula, PMA);
                    v.add(f);

                    break;
                //Camión
                case 4:
                    System.out.println("");
                    System.out.println("Camion");
                    System.out.println("");
                    System.out.print("Introduzca la matrícula del vehículo: ");
                    matricula = stdin.readLine();
                    System.out.print("Introduzca PMA del vehículo: ");
                    PMA = Integer.parseInt(stdin.readLine());
                    Camion ca = new Camion(matricula, PMA);
                    v.add(ca);

                    break;
                //Atrás
                case 5:
                    System.out.println("");
                    System.out.println("Atrás...");
                    System.out.println("");
                    break;
                //Errores
                default:
                    System.out.println("");
                    System.out.println("Error con la opción, vuelva a intentarlo...");
                    System.out.println("");
                    break;
            }
        } while (op != 5);

    }
}
