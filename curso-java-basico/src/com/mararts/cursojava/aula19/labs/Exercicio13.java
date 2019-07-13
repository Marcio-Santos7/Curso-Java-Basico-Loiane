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
public class Exercicio13 {
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int vetorSomaMultiplos5 = 0; 
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o elemento da posição " + (i + 1) + " do vetor A: ");
            vetorA[i] = scan.nextInt();
            
            if(vetorA[i] % 5 == 0){
                vetorSomaMultiplos5 += vetorA[i];
            }
        }
        
        System.out.println("O vetor A é igual a: ");
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        
        System.out.println("A soma dos elementos múltiplos de 5 do vetor A é: ");
        System.out.print(vetorSomaMultiplos5);
        
        System.out.println();
    }
}
