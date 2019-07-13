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
public class Exercicio11 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int pares = 0;
        
        // Construindo o vetor A
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o " + (i + 1) + "º elemento do vetor A");
            vetorA[i] = scan.nextInt();
            if(vetorA[i] % 2 == 0){
               pares += 1; 
            }
        }
        
        System.out.println("O vetor A é igual a: ");
        for(int i = 0; i < 10; i++){
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        
        System.out.println("O vetor A possui " + pares + " números pares !!! ");
    }
}
