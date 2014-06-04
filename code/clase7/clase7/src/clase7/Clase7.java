/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author k
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner oScanner = new Scanner(System.in);
        do {
            System.out.println("Digite la opcion que desea :");
            System.out.println("1.Ejercicio");
            System.out.println("2.Ejercicio");
            opcion = oScanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Digite el correo a evaluar");
                    oScanner = new Scanner(System.in);
                    ejercicio1 oejercicio1 = new ejercicio1(oScanner.nextLine());

                    System.out.println(oejercicio1.ValidarCorreo());
                    break;
                case 2:
                    System.out.println("Digite la cadena a evaluar");
                    oScanner = new Scanner(System.in);
                    ejercicio2 oejercicio2 = new ejercicio2();
                    oejercicio2.setCadena(oScanner.nextLine());
                    System.out.println(oejercicio2.MediaCadena());
                    System.out.println(oejercicio2.UltimoValor());
                    System.out.println(oejercicio2.Alrevez());
                    System.out.println(oejercicio2.Guion());
                     System.out.println(oejercicio2.Vocales());
                             Boolean a;
                             if(oejercicio2.Palindromo()==true)
                             {
                                  System.out.println("La palabra es igual");
                             }
                             else
                             {
                                 System.out.println("La palabra no es igual al derecho") ;
                             }
                    break;
            }
        } while (opcion <= 2);


    }

}
