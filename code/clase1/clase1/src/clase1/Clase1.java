/*
 * Name:Class1
 *information:This is first class
 *Date:7/5/2014
 *Copyright
 */
package clase1;

import java.io.IOException;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Clase1 {

    /**
     * @param args the command line arguments This is the main method
     */
    public static void main(String[] args) throws IOException {
        double horasTrabjadas = 0;
        double costoHora = 0;
        double salario = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Hello world" + "\n");

        System.out.print("Digite las horas laboradas por el trabajador" + "\n");

        horasTrabjadas = Double.parseDouble(teclado.nextLine());

        System.out.print("Digite costo de hora" + "\n");

        costoHora = Double.parseDouble(teclado.nextLine());


        System.out.print(horasTrabjadas);

        salario = horasTrabjadas * costoHora;

        System.out.print("El salario final es " + salario);



    }
}
