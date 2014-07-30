/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class14_seleccion;

/**
 *
 * @author k
 */
public class Class14_Seleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo={56,4,89,85,42,1,2,32,3 };
        int[] arregloOrdenado;
        seleccion o=new seleccion();
      arregloOrdenado=o.OrdenS(arreglo, "A");
        for(int i=0;i<arregloOrdenado.length;i++){
            System.out.println(arregloOrdenado[i]);
        }
            
        
    }
    
}
