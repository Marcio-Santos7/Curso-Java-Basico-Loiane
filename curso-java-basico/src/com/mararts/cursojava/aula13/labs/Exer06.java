/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * Cálculo da área do círculo
 * @author Marcio Leandro
 */
public class Exer06 {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o raio do círculo: ");
        double raioCirculo = scan.nextDouble();
        
        double areaCirculo = Math.PI  * Math.pow(raioCirculo, 2);
        
        System.out.println("A área do círculo é igual a: " + areaCirculo);
        
    }
}
