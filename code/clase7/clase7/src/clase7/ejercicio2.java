/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase7;

/**
 *
 * @author k
 */
public class ejercicio2 {
    private String Cadena;

    public String getCadena() {
        return Cadena;
    }

    public void setCadena(String Cadena) {
        this.Cadena = Cadena;
    }

   
    public String MediaCadena()
    {
        String retorno="";
        for(int i=0;i<getCadena().length()/2;i++)
        {
            retorno+=getCadena().charAt(i);
        }
        return retorno ;
    }
    
    public String UltimoValor()
    {
        return getCadena().charAt(getCadena().length()-1)+"";
    }
    public String Alrevez()
    {
       String retorno="";
        for(int i=getCadena().length()-1;i>=0;i--)
        {
            retorno+=getCadena().charAt(i);
        }
        return retorno ; 
    }
}
