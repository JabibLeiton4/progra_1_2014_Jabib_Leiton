/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class9;

import java.util.Scanner;

/**
 *
 * @author k
 */
public class Class8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String salarios;
        boolean continuar = false;
        int opcion;
        do {

            Scanner oScanner = new Scanner(System.in);
            ejercicio1 oA = new ejercicio1();
            System.out.println("Digite la opcion del ejercicio evauar");
            System.out.println("1.Ejercicio");
            System.out.println("2.Ejercicio");
            System.out.println("3.Ejercicio");
            System.out.println("4.Salir");
            opcion = oScanner.nextInt();


            switch (opcion) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        oScanner = new Scanner(System.in);
                        System.out.print("Digite el salario del trabajador # " + (i + 1 + "\n"));
                        oA.AgregarSalario(oScanner.nextDouble());
                    }
                    System.out.print(oA.ImprimirSueldos());
                    break;
                case 2:
ejercicio2 a = new ejercicio2();
                    

                    for (int i = 0; i < 5; i++) 
                    {
                        oScanner = new Scanner(System.in);
                        System.out.println("Digite la altura de la persona # " + (i + 1));
                       a.AgregarAltura(oScanner.nextFloat());

                        
                    }
                    System.out.println("el promedio es:" + a.Promedio());
                    System.out.println(a.ContarPersonas());

                    break;
                case 3:
                    ejercicio3 w=new ejercicio3();
                    for (int i = 0; i < 4; i++){
                    
                    oScanner = new Scanner(System.in);
                    
                    System.out.println("Digite el salario matutino de la persona #" + (i+1));
                    w.salariosMañana(oScanner.nextInt());
                    }
                System.out.println("La suma de los salarios de la tarde es " + w.sumaMañana());
                
                 
                    for (int i = 0; i < 4; i++){
                    
                    oScanner = new Scanner(System.in);
                    
                    System.out.println("Digite el salario de la tarde de la persona #" + (i+1));
                    w.salariosTarde(oScanner.nextInt());
                    }
                System.out.println("La suma de los salarios de la mañana es " + w.sumaTarde());
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                    break;
                default:
                    break;
            }
        } while (opcion <= 4);
    }

}
