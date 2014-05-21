/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author k
 */
public class Practica2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * cicle #1
         */
        int numero;
        char A = '*';
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el numero");

        numero = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i < numero; i++) {
            System.out.print(A);
        }
        /**
         * cicle #2
         */
        System.out.print("\n");

        int n;
        int y;

        System.out.println("Digite n");
        n = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite y");
        y = Integer.parseInt(teclado.nextLine());
        for (int i = 1; i <= n; i++) {

            if (i % y == 0) {
                System.out.print("*");

            } else {
                System.out.print(i);
            }

        }
        //Cilce #3
        double inicial;
        double aumento;
        double Final;
        System.out.println("Digite el numero inicial");

        inicial = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el aumento");
        aumento = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el numero final");
        Final = Integer.parseInt(teclado.nextLine());
        for (double i = inicial; i <= Final; i += aumento) {

            System.out.println(i);
        }
        //ciclo 5
        double num2, potencia, resul = 0;
        System.out.println("Digite un numero");
        num2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite la potencia");
        potencia = Integer.parseInt(teclado.nextLine());
        resul = num2;
        for (double i = 1; i < potencia; i++) {
            num2 = num2 * resul;
            System.out.println(num2);

        }

        //ciclo 6
        int numm = 111;

        do {
            System.out.println(numm);
            numm++;

        } while (numm <= 999);

        //cicle 7 XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        int cantidad, numeros;
        System.out.println("Digite la cantidad de numeros");
        cantidad = Integer.parseInt(teclado.nextLine());
        int par = 0;
        int impar = 0;
        for (int i = cantidad; i > 0; i--) {
            System.out.println("Digite los   numeros");
            numeros = Integer.parseInt(teclado.nextLine());

            if (numeros % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }

        }
        System.out.println("La cantidad de numeros pares son: " + par);
        System.out.println("La cantidad de numeros impares son: " + impar);

        //ciclo 8
        int number, result, cont = 0;

        System.out.println("Digite el numero");
        number = Integer.parseInt(teclado.nextLine());

        do {
            result = number * cont;
            System.out.println(number + "*" + cont + "=" + result);

            cont++;
        } while (cont <= 10);

        //cicle 9
        int nun = 0, conta = 1;
        double nun2 = 0, promedio;

        while (conta <= 10) {
            System.out.println("Digite diez numeros");
            nun = Integer.parseInt(teclado.nextLine());
            nun2 = nun + nun2;
            conta++;
        }
        promedio = nun2 / 10;
        System.out.println("El promedio es " + promedio);

        //cicle 19i
        int nun3, suma=0,contador=0;
double promedio1;
        do {
            System.out.println("Digite calificaciones");
            nun3 = Integer.parseInt(teclado.nextLine());
            suma=nun3+suma;
            contador++;

        } while (nun3 > 0);
promedio1=suma/contador;
System.out.println("El promedio es "+promedio1);

//ciclo11
 int valorDolar=560,resultado,billete=1;
 
 for(int i=1;i<=10;i++)
 {
     resultado=valorDolar*i;
     System.out.println(billete+" Dolar<es> equivale a "+resultado+" 1Colones");
     billete++;
             
 }
 //cicle 12
 
 double deposito=1000,multi;
 for(int i=0;i<=12;i++)
 {
     multi=deposito*0.02;
     deposito=deposito-multi;
 }
 System.out.println("El monto final es "+deposito);
 
// ciclo13
 
 int horas=0,minutos=0,segundos=0;
 
 
 do{
 
     if(segundos==59)
     {
         segundos=00;
     }
     else{
         segundos++;
     }
 
 
     if(segundos==0)
     {
        minutos++; 
     }
     else
     if(minutos==59)
     {
         minutos=00;
     }
     
     
 
     
     
 
    if(minutos==59){
        horas++;
        

    } 
     System.out.println( "La hora es"+horas+":" +minutos+":" +segundos);
     
 }while(horas<=23);
 

 
 //cicle 15
 
 int numerosImpares;
 System.out.println("Digite la cantidad de numeros impares que desea ver");
            numerosImpares = Integer.parseInt(teclado.nextLine());
            
    }

}
