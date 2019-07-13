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
public class Exercicio16 {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int somaMenor15 = 0;
        int elementoIgual15 = 0; 
        int somaMaior15 = 0;
        int qtdMaior15 = 0;
        
        // Implementação do Vetor A
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + (i + 1) + " do Vetor A: ");
            vetorA[i] = scan.nextInt();            
        }
        
        for(int i = 0; i < vetorA.length; i++){
            if(vetorA[i] < 15){
                somaMenor15 += vetorA[i];
            } else if(vetorA[i] == 15){
                elementoIgual15 += 1;
            } else {
                qtdMaior15++;
                somaMaior15 += vetorA[i];
            }
        }
        
        System.out.print("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        
        System.out.println("Qtd números == 15: " + elementoIgual15);
        
        System.out.println("Qtd números < 15: " + somaMenor15);
        
        System.out.println("Média números > 15: " + (somaMaior15 / qtdMaior15));
    }
}
