/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class_16_burbuja;

import java.util.Scanner;

/**
 *
 * @author Jabib Leiton
 */
public class Class_16_burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo={56,4,85,85,42};
        int[]arregloOrdenado;
        Scanner teclado=new Scanner(System.in);
        String opcion;
        System.out.println("Digite la letra"
                + "\n"+"A si es de forma ascendente o"+"\n"+"B si es de forma descendente");
                opcion=teclado.nextLine();
               
        burbuja B=new burbuja();
        arregloOrdenado=B.OrdenamientoB(arreglo,"A");
        System.out.println("Ordenamiento Burbuja");
        for(int i=0;i<arregloOrdenado.length;i++){
            System.out.println(arregloOrdenado[i]);
        }
        
        
    }
}
