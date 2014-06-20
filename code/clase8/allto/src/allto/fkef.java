/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package allto;

import java.util.ArrayList;

/**
 *
 * @author k
 */
public class fkef {
    public void rjnfjnjn()
    {
     ArrayList lista=new ArrayList();
    int x=5;
    int y=5;
    int matriz[][]=new int[x][y];
    int aleatorio;
    for(int i=0;i<x;i++){
      for(int j=0;j<y;j++){
        do{
          aleatorio=(int)(Math.random()*(x*y+1));
        }while(lista.contains(aleatorio));
        lista.add(aleatorio);
        matriz[i][j]=aleatorio;        
      }
    }
    for(int i=0;i<x;i++){
      for(int j=0;j<y;j++){
        if(j==0) System.out.print("\n");
        System.out.print(matriz[i][j]);
        System.out.print("\t");        
      }
    }
  }
    
}
