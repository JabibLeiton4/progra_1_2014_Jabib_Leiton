/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atributos;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class account {

    private double saldoInicial;
    public boolean hayError;

    public account() {
        saldoInicial = 0;
        hayError=false;
    }

    public boolean isHayError() {
        return hayError;
    }

    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    //este metodo sirve para aumentar la cuenta de un usuario
    //@param monto Parametro para recibir el nuevo monto
    public void Deposito(double monto) {
        saldoInicial += monto;
    }
    //Sirve para disminuir la cuenta de un usuario
    //@param monto Parametro para recibir el nuevo monto

    public void Retiro(double monto) 
    {
        if (getSaldoInicial() >= monto) 
        
            setSaldoInicial(getSaldoInicial() - monto);
         else 
        
            setHayError(true);
        
        
    }
}
