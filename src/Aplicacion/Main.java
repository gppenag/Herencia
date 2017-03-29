/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        
    java.util.Scanner teclado= new Scanner (System.in);
      
    
        Persona persona = new Persona("ghrh", "edgfrrt", "ght", 6);
        double [] Notas= new double[4];
        Notas[0]= 4;
        Notas[1]= 5;
        Notas[2]= 4;
        Notas[3]= 5;
        
        Estudiante estudiante = new Estudiante(Notas,"gyury", "math", "calle 124",6972354 );
        Profesor profesor = new Profesor("dfg","math","calle 34",567894);
        
    }
}
