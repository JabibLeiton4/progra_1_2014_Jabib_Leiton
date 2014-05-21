/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice.pkg3;

import java.util.Scanner;

/**
 *
 * @author k
 */
public class Practice3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //primer metodo
        int num,op=0;
         Scanner teclado = new Scanner(System.in);
         
          System.out.println("Digite un numero de mes");
                        num=Integer.parseInt(teclado.nextLine());
                        switch(num)
                        {
                            case 1:
                          System.out.println("El mes corresponde a Enero"); 
                                break;
                            case 2:
                               System.out.println("El mes corresponde a Febrero"); 
                                break;
                            case 3:
                                System.out.println("El mes corresponde a Marzo");
                                break;
                            case 4:
                                System.out.println("El mes corresponde a Abril");
                                break;
                            case 5:
                                System.out.println("El mes corresponde a Mayo");
                                break;
                            case 6:
                                System.out.println("El mes corresponde a Junio");
                                break
                                        ;
                            case 7:
                                System.out.println("El mes corresponde a Julio");
                                break;
                            case 8:
                                System.out.println("El mes corresponde a Agosto");break;
                            case 9:
                                System.out.println("El mes corresponde a Septiembre");
                                break;
                            case 10:
                                System.out.println("El mes corresponde a Octubre");
                                break;
                            case 11:
                               System.out.println("El mes corresponde a Noviembre"); 
                                break;
                            case 12:
                                System.out.println("El mes corresponde a Diciembre");
                                break;
                        }
                        // segundo metodo
                        int number;
                       System.out.println("Digite un numero");
                        number=Integer.parseInt(teclado.nextLine()); 
                        
    }
    
}
