/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD3;

import java.util.Scanner; 
/**
 *
 * @author Moserrath
 */
public class ejercicio5 {
    public static void main(String[] args){
      Scanner n=new Scanner(System.in); 
       int promedio;
       System.out.println("Ingrese su promedio:");
       promedio= n.nextInt(); 
       
       if(promedio>70){
           System.out.println("Ust Aprobo");
       }
       else{
           System.out.println("Ust Reprobo");
       }
    } 
}
