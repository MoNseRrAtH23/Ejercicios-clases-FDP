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
public class ejercicio12 {
     public static void main(String[] args) {
        /* 
        CONDICIONALES
        
        IF (CONDICION)
        IF(CONDICION)  - ELSE
        IF (CONDICION)  - ELSE     AND, OR
        ANIDAR O AGRUPA  IF(CONDICION)  - ELSE - NO ES UNA BUENA PRACTICA
        
        Instrucción Switch
        Sintaxis de la instrucción switch
        switch (<expresión>) {
            case <valor>:
                     <lista de sentencias separadas por punto y coma>;
            case <valor>:
                     <lista de sentencias separadas por punto y coma>;
            …
            default:
                     <lista de sentencias separadas por punto y coma>;
        }
        
        - La expresión que evalua el switch puede ser una variable de tipo numerica o 
          de tipo cadena (String)
        - Las sentencias que pertenecen a la opción "default" se ejecutarán en caso de
          que no se encuentre ninguno de los casos evaluados.
        */
        Scanner lector = new Scanner(System.in);
        String signoZodiacal;
        System.out.println("Programa que te dice con cual signo zodiacal eres compatible como pareja");
        System.out.println("Escribe tu signo zodiacal:");
        signoZodiacal = lector.nextLine();
        
        switch(signoZodiacal.toLowerCase()){
            case "aries":
                             System.out.println("Eres compatible con Leo, Sagitario, Geminis, Libra y Acuario");
                break;
            case "tauro":
                             System.out.println("Eres compatible con Virgo, Capricornio, Cancer, Escorpion y Piscis");
                break;
            case "geminis":
                             System.out.println("Eres compatible con Libra, Acuario, Aries, Leo y Sagitario");
                break;
            case "cancer":
                              System.out.println("Eres compatible con Escorpion, Piscis, Tauro, Virgo y Capricornio");
                break;
            case "leo":
                              System.out.println("Eres compatible con Aries, Sagitario, Geminis, Libra y Acuario");
                break;
            case "virgo":
                             System.out.println("Eres compatible con Tauro, Capricornio, Cancer, Escorpion y Piscis");
                break;
            case "libra":
                             System.out.println("Eres compatible con Geminis, Acuario, Aries, Leo y Sagitario");
                break;
            case "escorpion":
                             System.out.println("Eres compatible con Cancer, Piscis, Tauro, Virgo y Capricornio");
                break;
            case "sagitario":
                             System.out.println("Eres compatible con Aries, Leo, Geminis, Libra y Acuario");
                break;
            case "capricornio":
                            System.out.println("Eres compatible con Tauro, Virgo, Cancer, Escorpion y Piscis");
                break;
            case "acuario":
                          System.out.println("Eres compatible con Geminis, Libra, Aries, Leo y Sagitario");
                break;
            case "piscis":
                          System.out.println("Eres compatible con Cancer, Escorpion, Tauro, Virgo y Capricornio");
                break;
            default:
                         System.out.println("Ese signo no existe.");
        }        
    }
}
