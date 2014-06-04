/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase8;

import java.util.Scanner;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author k
 */
public class Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner oScanner = new Scanner(System.in);
        int opcion;
        String palabra,palabra2 = "",oracion="";
        do{
            
            
            System.out.println("Digite la opcion que desea :");
            System.out.println("1.Ejercicio");
            System.out.println("2.Ejercicio");
            opcion = oScanner.nextInt();
            
            switch(opcion)
            {
                case 1:
                 System.out.println("Digite la palabra");
                  
                    oScanner = new Scanner(System.in);
                    problema1 oproblema1=new problema1();
                     oproblema1.setPalabra(oScanner.nextLine());
                 System.out.println(oproblema1.Alrevez());
                 System.out.println(oproblema1.Palindromo());
                 System.out.println("Digite una palabra");
                 oproblema1.setPalabra2(oScanner.nextLine());
                 System.out.println("Digite una oracion");
                 oproblema1.setOracion(oScanner.nextLine());
                 System.out.println( oproblema1.indexOf(palabra2));
                 // compilamos el patron


                    break;
                case 2:
                        
            }
                    
            
        }while(opcion<=25);
             
    } 
    
}
