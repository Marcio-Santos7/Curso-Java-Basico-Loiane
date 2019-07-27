/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * Cálculo da área do quadrado e o dobro da área
 * @author Marcio Leandro
 */
public class Exer07 {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a medida do lado do quadrado: ");
        double ladoQuadrado = scan.nextDouble();
        
        //area = lado * lado
        double areaQuadrado = Math.pow(ladoQuadrado, 2);
        
        System.out.println("A área do quadrado é: " + areaQuadrado);
        
        double areaQuadradoDobro = 2 * areaQuadrado;
        
        System.out.println("O dobro da área do quadrado é: " + areaQuadradoDobro);
    }
}
