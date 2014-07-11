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
public class NodoDeLista {
    private String dato;
    private String cuentaBancaria;

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    private NodoDeLista siguiente;
    public NodoDeLista()
    {
        dato="";
        siguiente=null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoDeLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDeLista siguiente) {
        this.siguiente = siguiente;
    }
    
}
