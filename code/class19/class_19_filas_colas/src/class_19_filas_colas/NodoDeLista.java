/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class_19_filas_colas;

/**
 *
 * @author k
 */
public class NodoDeLista {
    
   private String dato;
   private NodoDeLista siguiente;

    public NodoDeLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDeLista siguiente) {
        this.siguiente = siguiente;
    }

   public NodoDeLista()
   {
       dato="";
              siguiente=null;
   }
   
   public String getDato()
   {
       return dato;
   }
   public void  setDato(String dato){
       this.dato=dato;
   }
   
}

   