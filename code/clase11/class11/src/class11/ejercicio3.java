/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class11;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class ejercicio3 {
 private Scanner teclado;
 private int[][]matriz;
    public void CargarMatriz() {
        teclado = new Scanner(System.in);
        matriz = new int[3][5];
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.println("ingrese el valor correspondiente");
                matriz[f][c] = teclado.nextInt();


            }
        }
    }
    
    public void primerFila()
    {
        System.out.println("primer fila");
        
        for(int c=0;c<4;c++)
        {
            System.out.println(matriz[0][c]);
        }
    }
    
    public void ultimaFila()
    {
       System.out.println("ultima fila");
        
        for(int c=0;c<4;c++)
        {
            System.out.println(matriz[2][c]);
        } 
    }
    
     public void primerColumna()
    {
       System.out.println("primer columna");
        
        for(int f=0;f<3;f++)
        {
            System.out.println(matriz[f][0]);
        } 
    }
     
      public void ultimacolumna ()
    {
       System.out.println("ultima columna");
        
        for(int f=0;f<3;f++)
        {
            System.out.println(matriz[f][3]);
        } 
    }
}
