/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner; 
/**
 *
 * @author Monserrath
 */
public class ejercicio7 {
    public static void main(String[] ars){
        Scanner lector = new Scanner (System.in);
        double base,altura,area; 
        System.out.println("Ingrese la base del triangulo");
        base=lector.nextDouble(); 
        System.out.println("ingrese la altura");
        altura=lector.nextDouble();
        area=(base*altura)/2; 
        
        System.out.println("El area del triangulo es:"+area);
    } 
}
