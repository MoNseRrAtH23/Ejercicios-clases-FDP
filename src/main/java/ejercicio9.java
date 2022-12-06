/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
/**
 *
 * @author Monserrath
 */
public class ejercicio9 {
  public static void main(String[] ars){
      //area de un trapecio 
      Scanner sc = new Scanner (System.in);
      double base1,base2,altura,area; 
      System.out.println("Ingrese la base mayor del traprecio:");
      base1= sc.nextDouble();
      System.out.println("Ingrese la base menor del trapecio:");
      base2= sc.nextDouble();
      System.out.println("Ingrese la altura del trapecio");
      altura= sc.nextDouble();
      
      area=(base1+base2*altura)/2; 
      System.out.println("El area del trapecio es:"+area);
      
  
  } 
}
