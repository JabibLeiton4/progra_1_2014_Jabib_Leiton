/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swicth;

/**
 *
 * @author k
 */
public class Operaciones {
    public double Sumar(double valor1,double valor2)
    {
        return valor1+valor2;
    }
    public double Resta(double valor1,double valor2)
    {
        return valor1-valor2;
    }
    public double Division(double valor1,double valor2)
    {
        return valor1/valor2;
    }
    public double Multiplicacion(double valor1,double valor2)
    {
        return valor1*valor2;
    }
    public double Raiz(double valor1)
    {
        return Math.sqrt(valor1);
    }
    public double Potencia(double valor1,double valor2)
    {
            return Math.pow(valor1,valor2);
    }
}
