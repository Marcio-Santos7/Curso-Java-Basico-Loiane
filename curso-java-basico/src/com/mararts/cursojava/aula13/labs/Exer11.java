/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * Cálculo com números inteiros e real.
 * @author Marcio Leandro
 */
public class Exer11 {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        double num3;
        int produto;
        double soma;
        double cubo;
        
        System.out.println("Digite 2 números inteiros: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        System.out.println();
        
        System.out.println("Digite 1 número real: ");
        num3 = scan.nextDouble();
    
        System.out.println();
        
        produto = (2 * num1) * (num2 / 2);
        System.out.println("O produto do dobro do primeiro com metade do "
                + "segundo é: " + produto);
        
        System.out.println();
        
        soma = (3 * num1) + (num3);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " 
                + soma);
        
        System.out.println();
        
        cubo = Math.pow(num3, 3);
        System.out.println("O terceiro elevado ao cubo: " + cubo);
    }
}
