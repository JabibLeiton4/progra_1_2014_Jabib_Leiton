/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class17;

/**
 *
 * @author k
 */
public class Lista {

    private NodoDeLista raiz;
    private int cant=0;

    public Lista() {
        raiz = null;
    }

    public void Insertar(String dato, String cuentaBancaria) {
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        nuevo.setCuentaBancaria(cuentaBancaria);
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoDeLista auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    public void Imprimir() {
        NodoDeLista recorrido = raiz;
        System.out.println("Listado de todos los elementos de la lista");
        while (recorrido != null) {
            System.out.println(recorrido.getDato() + ", la cuenta bancaria es" + recorrido.getCuentaBancaria());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
    }

    public boolean EstaVacia() {
        if (raiz == null) {
            return true;
        }
        return false;
    }

    public void EliminarPrimero(String[] lista, String buscado, int bus) {
        
        int Aux=0;
        int Fijo=0;
          int cant=0;
        
        for (int i = 0; i < lista.length; i++) 
        {
          
            bus = 0;

            if (lista[i].equals(bus)) 
            {
                cant=lista.length;
                
              for(int i=0;i<cant;i++)
              {
                   
                  Aux=lista.length-(cant-2);
                  Fijo=Aux;
              } 
            }
            else
            {
            }
        }

    }
}
