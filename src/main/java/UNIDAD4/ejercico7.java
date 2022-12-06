/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;

import java.util.Scanner;

/**
 *
 * @author Moserrath
 */
public class ejercico7 {
    public static void main(String[] args) {
         //Declaracion de matriz
         String[][]alumnos=new String[4][5];
         
         String[][]profesores={{"Jose Juan","Cesar","Ivan"},
                               {"Briseida","Miguel","Kenya"},
                               {"Marcos","Nancy","Maria"}};
            
            
            int [][]respuestas_eval_docente;
            int filas, columnas;
            Scanner lector = new Scanner(System.in);
            System.out.println("Ingrese el numero de filas de la matriz");
            filas=lector.nextInt();
            System.out.println("Ingrese el numero de colomnas de la matriz");
            columnas=lector.nextInt();
            respuestas_eval_docente=new int[filas][columnas];
            
        for (String[] profesore : profesores) {
            for (int j = 0; j < profesores.length; j++) {
                System.out.println(profesore[j] + "");
            }
            System.out.println("");
        }
            
 
         }
}
