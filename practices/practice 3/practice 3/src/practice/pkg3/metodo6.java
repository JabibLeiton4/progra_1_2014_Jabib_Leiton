/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice.pkg3;

/**
 *
 * @author k
 */
public class metodo6 {

   
   
   
   public int fechaanterior(int dia,int mees)
   {
       if(mees==2)
           
       {
           if(dia==1)
           {
               mees--;
               dia=28;
           }
           else
           {
               dia=dia-1;
               mees=mees-1;
           }
       }
       else
       {
           
       
      if(mees==3||mees==5||mees==7||mees==8||mees==12||mees==1||mees==10)
      {
          if(mees==1&&dia==1)
          {
              mees=12;
              dia=31;
              
          }
          else
          {
              mees=mees-1;
              dia=dia-1;
          }
          
      }
      else
      {
         if(mees==4||mees==6||mees==9||mees==11)
         {
            if(mees==1&&dia==1) 
            {
                mees=12;
                dia=30;
            }
            else
            {
                mees=mees-1;
                dia=dia-1;
            }
         }
      }
      
      
      
   }
       return mees;
       
   }
   public int anterior1(int dia,int mees)
   {
       if(mees==2)
           
       {
           if(dia==1)
           {
               mees--;
               dia=28;
           }
           else
           {
               dia=dia-1;
               mees=mees-1;
           }
       }
       else
       {
           
       
      if(mees==3||mees==5||mees==7||mees==8||mees==12||mees==1||mees==10)
      {
          if(mees==1&&dia==1)
          {
              mees=12;
              dia=31;
              
          }
          else
          {
              mees=mees-1;
              dia=dia-1;
          }
          
      }
      else
      {
         if(mees==4||mees==6||mees==9||mees==11)
         {
            if(mees==1&&dia==1) 
            {
                mees=12;
                dia=30;
            }
            else
            {
                mees=mees-1;
                dia=dia-1;
            }
         }
      }
      
      
      
   }
       return dia;
       
   }
}
