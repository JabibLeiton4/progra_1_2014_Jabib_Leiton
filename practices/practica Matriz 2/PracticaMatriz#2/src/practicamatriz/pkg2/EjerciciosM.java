/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamatriz.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author k
 */
public class EjerciciosM {

    private int[][] matriz = new int[3][3];
    private Scanner teclado;
    private int suma = 0;
    double promedio;

    public void llenarMatriz() {
        for (int f = 0; f < 3; f++) {
            teclado = new Scanner(System.in);
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor correspondiente");
                matriz[f][c] = teclado.nextInt();
                suma = suma + matriz[f][c];

            }
        }
    }

    public double promedio() {
        promedio = suma / (3 * 3);
        return promedio;
    }

    //ejercicio 2 imprimir el mayor de los impares
    public int ImprimirMayor() {
        int mayorImpar = 0;
        teclado = new Scanner(System.in);
        for (int f = 0; f < 3; f++) {

            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor correspondiente");
                matriz[f][c] = teclado.nextInt();

                if (matriz[f][c] % 2 != 0) {
                    if (matriz[f][c] > mayorImpar) {
                        mayorImpar = matriz[f][c];
                        break;
                    }
                    break;
                }

            }
        }
        return mayorImpar;

    }
    //ejercicio 3 imprimir el promedio de pares
    public double ImprimirProPares()
    {
        int pro=0;
        int cont=0;
        int resul=0;
        teclado = new Scanner(System.in);
         for (int f = 0; f < 3; f++) {

            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor correspondiente");
                matriz[f][c] = teclado.nextInt();

                if (matriz[f][c] % 2 == 0) {
                    cont++;
                    pro=pro+matriz[f][c];
                    resul=pro/cont;
                    
                    break;
                }
                }
            }
    
         
        return resul;       
    }
}
