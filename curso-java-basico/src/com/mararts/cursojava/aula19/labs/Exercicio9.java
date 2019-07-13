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
public class Exercicio9 {
    
    public static void main ( String[] args){
    
        Scanner scan = new Scanner( System.in );
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        double[] vetorC = new double[10];
        
        for( int i = 0; i < vetorA.length; i++){        
            System.out.println("Entre com o valor da posição " + (i + 1) + " do vetor A: ");
            vetorA[i] = scan.nextInt();
        }
        
        for( int i = 0; i < vetorB.length; i++){        
            System.out.println("Entre com o valor da posição " + (i + 1) + " do vetor B: ");
            vetorB[i] = scan.nextInt();
        }
        
        for( int i = 0; i < vetorC.length; i++){        
            vetorC[i] = vetorA[i] / vetorB[i];
        }
        
        System.out.print(" O vetor A é: ");
        
        for( int i = 0; i < vetorA.length; i++){        
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        
        System.out.print(" O vetor B é: ");
        
        for( int i = 0; i < vetorB.length; i++){        
            System.out.print(vetorB[i] + " ");
        }
        
        System.out.println();
        
        DecimalFormat df = new DecimalFormat("###,###.##");
        
        System.out.print(" O vetor C é: ");
        
        for( int i = 0; i < vetorC.length; i++){        
            System.out.print(vetorC[i] + " ");
        }
        
        System.out.println();
    }
}
