/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class9;

/**
 *
 * @author k
 */
public class ejercicio3 {

    private int mañana[] = new int[4];
    private int tarde[] = new int[4];
   private int suma,suma2;

    public int salariosMañana(int mañanas)
    {     
    
        for (int i = 0; i < mañana.length; i++) 
        {
            {
                if (mañana[i] == 0) 
                {
                    mañana[i] = mañanas;
                    suma=suma+mañanas;
                    break;
                }
                
            }
        }
       return suma;
    }

      
    
    public int sumaMañana()
    {
      int sum=suma;
        
     return suma; 
        
    }

     public int salariosTarde(int tardes)
    {     
    
        for (int i = 0; i < tarde.length; i++) 
        {
            {
                if (tarde[i] == 0) 
                {
                    mañana[i] = tardes;
                    suma2=suma2+tardes;
                    break;
                }
                
            }
        }
       return suma2;
    }

      
    
    public int sumaTarde()
    {
      int sum=suma2;
        
     return suma2; 
        
    }

    

    
}
