/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice;

/**
 *
 * @author CASA
 */
public class Lista {
    
    private NodoDeLista raiz;

    public Lista() {
        raiz = null;
        
    }

    public void Insertar(int dato) {
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        
        
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = null;
        } else {
            NodoDeLista auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);

        }
    }

    public void Imprimir() {
        NodoDeLista recorrido = raiz;
        System.out.println("Listado de todos los elementos de la lista");
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
    }

    public Boolean EstaVacia() {
        if (raiz == null) {
            return true;
        }
        return false;
    }
public void sumanodos(int cont)
{
   System.out.println("el numero de nodos es "  +(cont-1)); 
}
    public void sumacuadrados(float suma)
    {
        System.out.println("la suma de los cuadrados es "  +(suma)); 
    }
}
