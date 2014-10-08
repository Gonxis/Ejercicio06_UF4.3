/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4_nf4.pkg3_ej6_gonzalo_cercos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Gonxi's
 */
// Clase Main desde donde llamaremos a todas las otras clases y ejecutaremos el programa
public class M03_UF4_NF43_Ej6_Gonzalo_Cercos {

    /**
     * @param args the command line arguments
     */
    private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        byte op = 0;

        ArrayList<Vehiculo> v = new ArrayList<Vehiculo>();

        do {

            System.out.println("-------------------- MENU --------------------");
            System.out.println(" ");
            System.out.println("1. Cargar datos de inicio");
            System.out.println("2. Añadir vehículo");
            System.out.println("3. Obtener precio de alquiler");
            System.out.println("4. Salir");
            System.out.println(" ");
            System.out.println("----------------------------------------------");

            try {
                System.out.print("Escoja la opción que desea hacer aqui: ");
                String input = stdin.readLine();
                op = Byte.parseByte(input);
            } catch (Exception e) {
                System.out.println("");
                System.out.println("Tipo de variable incorrecta, se necesita un número entero");
            }

            switch (op) {
                case 1: //Cargar datos de inicio
                    System.out.println("");
                    System.out.println("Cargar datos de inicio");
                    System.out.println("");

                    Acciones.leer_fichero();
                    break;
                case 2: //Añadir vehículo
                    System.out.println("");
                    System.out.println("Añadir vehículo");
                    System.out.println("");
                    int op1 = 0;
                    do {

                        System.out.println("------------------ Tipo de ve --------------------");
                        System.out.println(" ");
                        System.out.println("1. Tipo de vehículo a introducir");
                        System.out.println("2. Matrícula del vehículo");
                        System.out.println("3. Nº de plazas o PMA");
                        System.out.println("4. Añadir vehículo al de la lista de la empresa");
                        System.out.println("5. Atrás");
                        System.out.println(" ");
                        System.out.println("-------------------------------------------------");

                        try {
                            System.out.print("Escoja la opción que desea hacer aqui: ");
                            String input = stdin.readLine();
                            op1 = Byte.parseByte(input);
                        } catch (Exception e) {
                            System.out.println("");
                            System.out.println("Tipo de variable incorrecta, se necesita un número entero");

                            switch (op1){
                                // Tipo de vehículo que se quiere utilizar
                                case 1:
                                    System.out.println("");
                                    System.out.println("Tipo de vehículo a introducir");
                                    System.out.println("");
                                    
                                    
                                    break;
                                //Matrícula del vehículo
                                case 2:
                                    System.out.println("");
                                    System.out.println("Matrícula del vehículo");
                                    System.out.println("");
                                    
                                    
                                    break;
                                case 3:
                                    System.out.println("");
                                    System.out.println("Nº de plazas o PMA");
                                    System.out.println("");
                                    
                                    break;
                                case 4:
                                    System.out.println("");
                                    System.out.println("Añadir vehículo al de la lista de la empresa");
                                    System.out.println("");
                                    
                                    break;
                                case 5:
                                    System.out.println("");
                                    System.out.println("Atrás...");
                                    System.out.println("");
                                    break;
                                default:
                                    System.out.println("");
                                    System.out.println("Error con la opción, vuelva a intentarlo...");
                                    System.out.println("");
                                    break;
                            }
                        }
                    } while (op1 != 5);
                    break;
                case 3: //Obtener precio de alquiler
                    System.out.println("");
                    System.out.println("Obtener precio alquiler");
                    System.out.println("");


                    break;
                case 4:// Sale del programa
                    System.out.println("");
                    System.out.println("Sayônara");
                    System.out.println("");
                    break;
                default: //Recoge errores entrados por pantalla del menú
                    System.out.println("");
                    System.out.println("Error al introducir la opción, por favor, vuelva a intentar..");
                    System.out.println("");
                    break;
            }
        } while (op != 4);
    }
}
