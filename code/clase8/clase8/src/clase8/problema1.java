/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author k
 */
public class problema1 {
    private String palabra="";
    private String palabra2="";
    private String oracion="";

    public String getOracion() {
        return oracion;
    }

    public void setOracion(String oracion) {
        this.oracion = oracion;
    }

    public String getPalabra2() {
        return palabra2;
    }

    public void setPalabra2(String palabra2) {
        this.palabra2 = palabra2;
    }

    

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    public String Alrevez( )
    {
          String retorno = "";
        for (int i = getPalabra().length() - 1; i >= 0; i--) {
            retorno += getPalabra().charAt(i);
        }
        return retorno;
    }
    public String Palindromo()
    {
      String retorno = "";
        for (int i = getPalabra().length() -2 ; i >= 0; i--) {
            retorno += getPalabra().charAt(i);
        }
        return "el palindromo es "+palabra+retorno;  
    }
    
    public int indexOf( String str ) 
    {
        String ora=getOracion();
        int palabra2=  ora.indexOf(getPalabra2());
        if(palabra2== ora.indexOf(getPalabra2()))
        {
           palabra2=ora.indexOf(ora+"-"+getPalabra2()) ;
        }
         for(int i=palabra2;i<ora.length();i++)
         {
         
         }
         
        
       
     return palabra2;  
         
    }
    
}
