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
public class Exercicio15 {
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int pares = 0;
        int impares = 0;
        int percentPares;
        int percentImpares;
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o elemento da posição " + (i + 1) + " do vetorA: ");
            vetorA[i] = scan.nextInt();
                      
        }
        
        for(int i = 0; i < vetorA.length; i++){        
             if(vetorA[i] % 2 == 0){
                pares += 1;    
            } else {
                impares += 1;
            }
        }
        
        System.out.println("O vetorA é igual a: ");
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        
        System.out.println();
        
        percentPares = (pares * 100) / vetorA.length;               
        percentImpares = (impares * 100) / vetorA.length;
        
        System.out.println("Percentual de números pares é: " + percentPares +"%");
        System.out.println("Percentual de números impares é: " + percentImpares + "%");
    }
}
