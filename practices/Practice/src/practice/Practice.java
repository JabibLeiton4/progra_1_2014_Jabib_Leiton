/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;


/**
 *
 * @author CASA
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Lista oLista = new Lista();
        NodoDeLista o=new NodoDeLista();
        int dato = 0;
        int cont=0;
        float cuadrados;
        float suma=0;
            oLista = new Lista();
        do{
            System.out.println("digite los numeros");
        o.setDato(teclado.nextFloat());
        cuadrados=o.getDato()*o.getDato();
        suma+=cuadrados;
        cont++;
        }while(o.getDato()!=0);
        
        oLista.Insertar(dato);
        PilasColumnas oPila = new PilasColumnas();
        oLista.Imprimir();
        oLista.sumanodos(cont);
        oLista.sumacuadrados(suma);
    }
}