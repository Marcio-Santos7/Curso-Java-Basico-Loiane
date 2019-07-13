/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author SONY VAIO
 */
public class Exercicio4 {
    
    public static void main( String[] args){
    
        Scanner scan = new Scanner( System.in );
        
        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];
        
        for(int i = 0; i < vetorA.length; i++){
        
            System.out.println("Entre com o valor da posição " + (i+1) + " : ");
            vetorA[i] = scan.nextInt();
            
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        
        System.out.println("O vetor A é: ");
        
        for(int i = 0; i < vetorA.length; i++){
        
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        
        DecimalFormat df = new DecimalFormat("###,###.###");
        
        System.out.println("O vetor B é: ");
        
        for(int i = 0; i < vetorB.length; i++){
        
            System.out.print(df.format(vetorB[i]) + " ");
        }
        
        System.out.println();
    }
}
