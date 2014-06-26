/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matriz;

import java.util.Scanner;

/**
 *
 * @author k
 */
public class ejercicio1 {
    
    
    private Scanner teclado;
    private int [][] matriz=new int[3][5];
    
    public void CargarMatriz(){
  
    
    for(int f=0;f<3;f++)
    {
        teclado = new Scanner(System.in);
        
        for(int c=0;c<5;c++){
            System.out.println("ingrese el valor correspondiente");
            matriz[f][c]=teclado.nextInt();
        }
    }
}
   public void imprimir()
   {
       for(int f=0;f<3;f++)
       {
           for(int c=0;c<5;c++)
           {
             System.out.println(matriz[f][c]);
             
           }
           System.out.println();
       }
   }
}
