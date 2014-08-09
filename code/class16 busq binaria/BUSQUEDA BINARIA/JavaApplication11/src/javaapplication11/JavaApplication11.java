/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author estudiante
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] arreglo2 ={"Campbell","Mario","Efren","Susana","Campbell","Agustin","Elias"};
        BusquedaLineal ñ=new BusquedaLineal();
        System.out.println("La busqueda binaria es:"+ñ.BuscarNombre(arreglo2, "Campbell"));
        System.out.println();
    }
}
