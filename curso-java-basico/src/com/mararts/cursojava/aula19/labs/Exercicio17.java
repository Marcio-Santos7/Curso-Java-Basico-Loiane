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
public class Exercicio17 {
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com a idade da pessoa " + (i + 1) + " do Vetor A: ");
            vetorA[i] = scan.nextInt();
        }
        
        int qtd = 0;
        for(int i = 0; i < vetorA.length; i++){
            if(vetorA[i] > 35){
                qtd++;
            }
        }
        
        System.out.print("Vetor de idade = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        
        System.out.println("Qtd pessoas idade > 35: " + qtd);
    }
}
