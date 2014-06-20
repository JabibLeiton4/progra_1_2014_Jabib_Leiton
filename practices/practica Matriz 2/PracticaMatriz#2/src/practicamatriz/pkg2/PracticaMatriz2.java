/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicamatriz.pkg2;

import java.util.Scanner;

/**
 *
 * @author k
 */
public class PracticaMatriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        char respuesta='s';
       do{
           int opcion=0;
       
        System.out.println("Menu");
        System.out.println("Ejercicio 1");
        System.out.println("Ejercicio 2");
        System.out.println("Ejercicio 3");
        opcion= teclado.nextInt();
        EjerciciosM M=new EjerciciosM();
       
        
        switch(opcion)
        {
            case 1:
               M.llenarMatriz();
              System.out.println( M.promedio());
                break;
            case 2:
                M.ImprimirMayor();
                System.out.println(M.ImprimirMayor());
                break;
            case 3:
                
                M.ImprimirProPares();
                System.out.println(M.ImprimirProPares());
                break;
        }
       } while( (respuesta == 's') || (respuesta == 'S'));
    } 
          
}
