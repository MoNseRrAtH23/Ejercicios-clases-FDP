/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
/**
 *
 * @author Monserrath
 */
public class ejercico12 {
    public static void main(String[] ars){
        Scanner sc= new Scanner(System.in);
        double cateto1,cateto2,hipotenusa,area,perimetro;
      //valor de la hipotenusa,area y perimetro 
        System.out.println("valor de cateto1:");
        cateto1=sc.nextDouble();
        System.out.println("valor de cateto2:");
        cateto2=sc.nextDouble();
        
        hipotenusa=Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2)); 
        area=cateto1*cateto2/2;
        perimetro=cateto1+cateto2+hipotenusa;
        
        System.out.println("===RESULTADOS OBTENIDOS===");
        System.out.println("Hipotenusa:"+hipotenusa);
        System.out.println("Area:"+area);
        System.out.println("Perimetro:"+perimetro);
    }
}
