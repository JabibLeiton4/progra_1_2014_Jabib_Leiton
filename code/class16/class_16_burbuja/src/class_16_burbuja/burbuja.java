/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class_16_burbuja;

/**
 *
 * @author Jabib Leiton
 */
public class burbuja {
    /**
     *
     *
     */
   
    public int [] OrdenamientoB(int [] arreglo,String ordenamiento)
    {
      
        int indice;
        int indice2;
        int auxiliar=0;
      
        if(ordenamiento.equals("A")){
        for(indice=0;indice<arreglo.length-1;indice++){
            for(indice2=0;indice2<((arreglo.length)-indice-1);indice2++){
                if(arreglo[indice2+1] < arreglo[indice2])
                {
                    auxiliar=arreglo[indice+1];
                    arreglo[indice2+1]=arreglo[indice2];
                    arreglo[indice2]=auxiliar;
                }
            }
        }
        
    }
    else
        {
          for(indice=arreglo.length-1;indice>0;indice--){
            for(indice2=(arreglo.length)-indice-1;indice2>0;indice2--){
                if(arreglo[indice2+1] < arreglo[indice2])
                {
                    auxiliar=arreglo[indice+1];
                    arreglo[indice2+1]=arreglo[indice2];
                    arreglo[indice2]=auxiliar;
                }
            }
        }
          }

        return null;
    } }      