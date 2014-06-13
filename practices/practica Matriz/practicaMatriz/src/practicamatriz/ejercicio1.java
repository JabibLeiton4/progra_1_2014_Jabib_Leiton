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
public class ejercicio1 {
//[fila][columna]
    private int[][] matriz;
    private Scanner teclado;

    public void ejercicio1() {
        teclado = new Scanner(System.in);
        matriz = new int[2][5];
        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                System.out.println("Ingrese el valor correspondiente");
                matriz[f][c] = teclado.nextInt();
            }
        }
    }

    public void Imprimir() {
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }
}
