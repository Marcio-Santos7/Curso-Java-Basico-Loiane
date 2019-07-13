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
public class Exercicio12 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int vetorSoma = 0;
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição " + (i + 1) + " do vetor A: ");
            vetorA[i] = scan.nextInt();
            vetorSoma = vetorSoma + vetorA[i];
        }
        
        System.out.println("O vetor A é igual a: ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        
        System.out.println("A soma dos elementos do vetor A é igual a: ");
        System.out.println(vetorSoma);
    }
    
}
