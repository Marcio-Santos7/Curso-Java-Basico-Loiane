/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * Lendo 4 notas e tirar a média entre elas.
 * @author Marcio Leandro
 */
public class Exer04 {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a primeira nota bimestral: ");
        double nota1 = scan.nextDouble();
        
        System.out.println("Entre com a segunda nota bimestral: ");
        double nota2 = scan.nextDouble();
        
        System.out.println("Entre com a terceira nota bimestral: ");
        double nota3 = scan.nextDouble();
        
        System.out.println("Entre com a quarta nota bimestral: ");
        double nota4 = scan.nextDouble();
        
        double  media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A média é: " + media);
        
    }
    
}
