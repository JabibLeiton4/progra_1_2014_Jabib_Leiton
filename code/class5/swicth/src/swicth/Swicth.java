/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swicth;

import java.util.Scanner;

/**
 *
 * @author jabib
 */
public class Swicth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean validar = true;
        double valor1 = 0;
        double valor2 = 0;
        double resultado;
        char continuar;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        Operaciones oOperaciones = new Operaciones();
        System.out.println("Digite la operacion a evaluar");
        do {

            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Division");
            System.out.println("4. Multiplicacion");
            System.out.println("5. Raiz");
            System.out.println("6. Potencia");
            opcion = Integer.parseInt(teclado.nextLine());

            switch(opcion)
                    
                    {
            
           
                        case 1:
                         System.out.println("Digite el valor del primer digito");
                        valor1=Integer.parseInt(teclado.nextLine());
                        System.out.println("Digite el valor del segundo digito");
                        valor2=Integer.parseInt(teclado.nextLine());
                         resultado=oOperaciones.Sumar(valor1,valor2);
                         System.out.println(resultado);
                        break;
                        case 2:
                        System.out.println("Digite el valor del primer digito");
                        valor1=Integer.parseInt(teclado.nextLine());
                        System.out.println("Digite el valor del segundo digito");
                        valor2=Integer.parseInt(teclado.nextLine());
                        resultado=oOperaciones.Resta(valor1,valor2);
                        
                         System.out.println(resultado);
                        break;
                        case 3:
                        System.out.println("Digite el valor del primer digito");
                        valor1=Integer.parseInt(teclado.nextLine());
                        System.out.println("Digite el valor del segundo digito");
                        valor2=Integer.parseInt(teclado.nextLine());
                        resultado=oOperaciones.Division(valor1,valor2);
                        System.out.println(resultado);
                        break;
                        case 4:
                        System.out.println("Digite el valor del primer digito");
                        valor1=Integer.parseInt(teclado.nextLine());
                        System.out.println("Digite el valor del segundo digito");
                        valor2=Integer.parseInt(teclado.nextLine());
                        resultado=oOperaciones.Multiplicacion(valor1,valor2);
                        System.out.println(resultado);
                        break;
                        case 5:
                        System.out.println("Digite el valor del primer digito");
                        valor1=Integer.parseInt(teclado.nextLine());
                    
                        resultado=oOperaciones.Raiz(valor1);
                        System.out.println(resultado);
                            break;
                        case 6:
                            System.out.println("Digite el valor del primer digito");
                        valor1=Integer.parseInt(teclado.nextLine());
                        System.out.println("Digite el valor del segundo digito");
                        valor2=Integer.parseInt(teclado.nextLine());
                        resultado=oOperaciones.Potencia(valor1,valor2);
                          System.out.println(resultado);
                    }

            System.out.println("Desea continuarcon otra operacion S/N");
            continuar = teclado.nextLine().charAt(0);
            if (continuar == 's' || (continuar == 'S')) {
                validar = true;
            } else {
                validar = false;
            }

        } while (validar);

    }

    private static void swicth(int opcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
