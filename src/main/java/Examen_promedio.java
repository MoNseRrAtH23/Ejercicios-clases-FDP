/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
/**
 *
 * @author Monserrath
 */
public class Examen_promedio {
  public static void main(String[] args){
      Scanner sc= new Scanner(System.in); 
      double califExamen,califInvstigacion,calFinal; 
        System.out.println("Ingrese la calificacion del Examen:"); 
        califExamen= sc.nextDouble(); 
      System.out.println("Ingrese la calificacion de investigacion"); 
      califInvstigacion= sc.nextDouble();
      calFinal=califExamen*0.4+califInvstigacion*0.25; 
      System.out.println("La calificacion Final de la Unidad 2 es:"+calFinal);
     
        
        
        
        
      
  }
  
}
