/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.pkg3;

import java.util.Random;
import java.util.Scanner;
import static javax.management.Query.in;
import javax.swing.JOptionPane;

/**
 *
 * @author k
 */
public class Practice3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //primer metodo
        int num, op = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite un numero de mes");
        num = Integer.parseInt(teclado.nextLine());
        switch (num) {
            case 1:
                System.out.println("El mes corresponde a Enero");
                break;
            case 2:
                System.out.println("El mes corresponde a Febrero");
                break;
            case 3:
                System.out.println("El mes corresponde a Marzo");
                break;
            case 4:
                System.out.println("El mes corresponde a Abril");
                break;
            case 5:
                System.out.println("El mes corresponde a Mayo");
                break;
            case 6:
                System.out.println("El mes corresponde a Junio");
                break;
            case 7:
                System.out.println("El mes corresponde a Julio");
                break;
            case 8:
                System.out.println("El mes corresponde a Agosto");
                break;
            case 9:
                System.out.println("El mes corresponde a Septiembre");
                break;
            case 10:
                System.out.println("El mes corresponde a Octubre");
                break;
            case 11:
                System.out.println("El mes corresponde a Noviembre");
                break;
            case 12:
                System.out.println("El mes corresponde a Diciembre");
                break;
        }
        // segundo metodo
        int number = 0;
        int opt2 = 0;
        char res = 's';

        do {
            System.out.println("Digite la opcion");

            System.out.println("1. numeros con terminacion en 2 , 5 u 8");
            System.out.println("2. numeros con terminacion en 4 ,7 o 9");
            opt2 = Integer.parseInt(teclado.nextLine());
            metodo2 m = new metodo2();
            switch (opt2) {
                case 1:
                    System.out.println("Digite un numero");
                    number = Integer.parseInt(teclado.nextLine());
                    System.out.println(m.cuadrado(number));

                    break;
                case 2:
                    System.out.println("Digite un numero");
                    number = Integer.parseInt(teclado.nextLine());
                    System.out.println(m.quintuple(number));

                    break;

            }

            System.out.println("Desea continuarcon otra operacion S/N");
            res = teclado.nextLine().charAt(0);
        } while (res == 's' || res == 'S');

        // tercer metodo
        int letra = 0;
        System.out.println("Digite la letra de calificacion");
        System.out.println("A=1");
        System.out.println("B=2");
        System.out.println("C=3");
        System.out.println("D=4");
        System.out.println("F=5");
        letra = Integer.parseInt(teclado.nextLine());
        metodo3 n = new metodo3();
        switch (letra) {
            case 1:
                System.out.println(n.A());
                break;
            case 2:
                System.out.println(n.B());
                break;
            case 3:
                System.out.println(n.C());
                break;
            case 4:
                System.out.println(n.D());
                break;
            case 5:
                System.out.println(n.E());
                break;

        }
        //METODO 4

        int mes, año;
        System.out.println("Digite cualquier mes");
        System.out.println("1.Enero");
        System.out.println("2.Febrero");
        System.out.println("3.Marzo");
        System.out.println("4.Abril");
        System.out.println("5.Mayo");
        System.out.println("6.Junio");
        System.out.println("7.Julio");
        System.out.println("8.Agosto");
        System.out.println("9.Septiembre");
        System.out.println("10.Octubre");
        System.out.println("11.Noviembre");
        System.out.println("12.Diciembre");
        mes = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el año");
        año = Integer.parseInt(teclado.nextLine());
        metodo4 b = new metodo4();
        switch (mes) {
            case 1:
                System.out.println(b.enero());
                break;
            case 2:
                System.out.println(b.febrero());
                break;
            case 3:
                System.out.println(b.marzo());
                break;
            case 4:
                System.out.println(b.abril());
                break;
            case 5:
                System.out.println(b.mayo());
                break;

            case 6:
                System.out.println(b.junio());
                break;
            case 7:
                System.out.println(b.julio());
                break;
            case 8:
                System.out.println(b.agosto());
                break;
            case 9:
                System.out.println(b.septiembre());
                break;
            case 10:
                System.out.println(b.octubre());
                break;
            case 11:
                System.out.println(b.noviembre());
                break;
            case 12:
                System.out.println(b.diciembre());
                ;
                break;
        }
                 //5 metodo numero aletorio y romanos

        int ae;

        Random rnd = new Random();

        ae = rnd.nextInt(3000);

        System.out.println("El numero es " + ae);

        

        int x;

        int mil, cent, dece, unid;

        mil = (ae / 1000);

        x = ae % 1000;

        cent = x / 100;

        x = x % 100;

        dece = x / 10;

        unid = x % 10;

        String Resul = "";

        switch (mil) {

            case 1:

                Resul = Resul + "M";

                break;

            case 2:

                Resul = Resul + "MM";

                break;

            case 3:

                Resul = Resul + "MMM";

                break;

        }

        switch (cent) {

            case 1:

                Resul = Resul + "C";

                break;

            case 2:

                Resul = Resul + "CC";

                break;

            case 3:

                Resul = Resul + "CCC";

                break;

            case 4:

                Resul = Resul + "CD";

                break;

            case 5:

                Resul = Resul + "D";

                break;

            case 6:

                Resul = Resul + "DC";

                break;

            case 7:

                Resul = Resul + "DCC";

                break;

            case 8:

                Resul = Resul + "DCCC";

                break;

            case 9:

                Resul = Resul + "CM";

                break;

        }

        switch (dece) {

            case 1:

                Resul = Resul + "X";

                break;

            case 2:

                Resul = Resul + "XX";

                break;

            case 3:

                Resul = Resul + "XXX";

                break;

            case 4:

                Resul = Resul + "XL";

                break;

            case 5:

                Resul = Resul + "L";

                break;

            case 6:

                Resul = Resul + "LX";

                break;

            case 7:

                Resul = Resul + "LXX";

                break;

            case 8:

                Resul = Resul + "LXXX";

                break;

            case 9:

                Resul = Resul + "XC";

                break;

        }

        switch (unid) {

            case 1:

                Resul = Resul + "I";

                break;

            case 2:

                Resul = Resul + "II";

                break;

            case 3:

                Resul = Resul + "III";

                break;

            case 4:

                Resul = Resul + "IV";

                break;

            case 5:

                Resul = Resul + "V";

                break;

            case 6:

                Resul = Resul + "VI";

                break;

            case 7:

                Resul = Resul + "VII";

                break;

            case 8:

                Resul = Resul + "VIII";

                break;

            case 9:

                Resul = Resul + "IX";

                break;

        }

        System.out.println("El numero en romanos es: " + Resul);
//metodo 6
        int dia;
        int mees;
        int añoo;
 metodo6 h = new metodo6();
        System.out.println("Digite la fecha");
        dia = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el mes ");
        mees = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el año ");
        añoo = Integer.parseInt(teclado.nextLine());
        
        
        //metodo 6
        
        
        System.out.println(h.anterior1(dia, mees)+"/"+h.fechaanterior(dia, mees)+"/"+añoo);

    }

}
