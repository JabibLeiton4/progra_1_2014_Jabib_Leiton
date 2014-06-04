/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binario;

public class Binario{
 public static int dinarioADecimal(String numeroBinario){
  int longitud = numeroBinario.length();//Numero de digitos que tiene nuestro binario
  int resultado = 0;//Aqui almacenaremos nuestra respuesta final
  int potencia = longitud - 1;
  for(int i = 0;i < longitud;i++){//recorremos la cadena de numeros
   if(numeroBinario.charAt(i) == '1'){
    resultado += Math.pow(2,potencia);
   }
   potencia --;//drecremantamos la potencia
  }
  return resultado;
 }
 
 public static String decimalABinario(int numeroDecimal){
  int temp = numeroDecimal;
  String resultado = "";
  while (temp != 0){
   if(temp % 2 == 0){
    resultado = "0" + resultado;
   }else{
    resultado = "1" + resultado;
   }
   temp = temp / 2;
  }
  return resultado;
 }
 
 public static String operacionBinaria(char operador,String numero1, String numero2){
  int n1Decimal = dinarioADecimal(numero1);
  int n2Decimal = dinarioADecimal(numero2);
  if(operador == '+'){
   return (decimalABinario(n1Decimal + n2Decimal));
  }else if(operador == '-'){
   return (decimalABinario(n1Decimal - n2Decimal));
  }else if(operador == '*'){
   return (decimalABinario(n1Decimal * n2Decimal));
  }else{
   return ("null");
  }
 }
 
 public static String sumaBinaria(String numero1,String numero2){
  return (operacionBinaria('+',numero1,numero2));
 }
 
 public static String sumaBinaria(String numero1,String numero2,String numero3){
  return sumaBinaria(sumaBinaria(numero1,numero2),numero3);
 }
 
 public static String restaBinaria(String numero1,String numero2){
  return (operacionBinaria('-',numero1,numero2));
 }
 
 public static String multiplicacionBinaria(String numero1,String numero2){
  return (operacionBinaria('*',numero1,numero2));
 }
 
 public static void main(String []args){
  System.out.println("-----De binario a decimal-----");
  System.out.println(dinarioADecimal("101010"));
  
  System.out.println("-----De decimal a binario-----");
  System.out.println(decimalABinario(10));
  
  System.out.println("-----Sumando dos binarios-----");
  System.out.println(sumaBinaria("101010","111000"));
  
  System.out.println("-----Sumando tres binarios-----");
  System.out.println(sumaBinaria("101010","111000","101010"));
  
  System.out.println("-----Restando dos binarios-----");
  System.out.println(restaBinaria("101010","111000"));
  
  System.out.println("-----Multiplicando dos binarios-----");
  System.out.println(multiplicacionBinaria("101010","111000"));
 }
}