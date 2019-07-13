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
public class Exercicio14 {
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int impares = 0;
        int numImpares = 0;
        int mediaImpares = 0;
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição " + (i + 1) + " do vetor A");
            vetorA[i] = scan.nextInt();
            
            if(vetorA[i] % 2 != 0){
                numImpares += 1;
                impares += vetorA[i]; 
            }
        }
        
        System.out.println("O vetor A é igual a: ");
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        
        mediaImpares = impares / numImpares;        
        System.out.println("A média dos números ímpares é igual a: " + mediaImpares);
        
        
    }
}
