/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamatriz;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class PracticaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        Scanner oScanner = new Scanner(System.in);
        System.out.println("Digita la opcion");
        System.out.println("ejercicio 1");
        System.out.println("ejercicio 2");
        System.out.println("ejercicio 3");
        System.out.println("ejercicio 4");
        opcion = oScanner.nextInt();


        switch (opcion) {

            case 1:
                ejercicio1 u = new ejercicio1();
                u.ejercicio1();
                u.Imprimir();
                break;

        }
    }
}
