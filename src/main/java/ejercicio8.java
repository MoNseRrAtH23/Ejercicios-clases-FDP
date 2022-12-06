/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
/**
 *
 * @author Monserrath
 */
public class ejercicio8 {
  public static void main(String[] ars){
      //radio de un circulo 
      Scanner leer= new Scanner (System.in); 
       double area,radio;
       System.out.println("Ingrese el radio del circulo:"); 
       radio= leer.nextDouble();
       
       area=Math.PI*Math.pow(radio,2); 
       System.out.println("El area del circulo es:"+area);
       
    }  
}
