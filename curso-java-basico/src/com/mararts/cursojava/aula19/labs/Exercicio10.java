/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula19.labs;

import java.util.Scanner;

/**
 *
 * @author SONY VAIO
 */
public class Exercicio10 {
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        
        // Construindo o vetor A
        for(int i = 0; i <10; i++){
            System.out.println("Digite o " + (i + 1) + "º elemento do vetor A");
            vetorA[i] = scan.nextInt();
        }
        
        // Construindo o vetor B
        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i] % 2;
        }
        
        System.out.println("O vetor A é igual a: ");
        for(int i = 0; i < 10; i++){
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        
        System.out.println("O vetor B é igual a: ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        
        System.out.println();
    }
}
