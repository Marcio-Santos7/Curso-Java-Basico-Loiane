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
public class Exercicio18 {
    public static void main( String[] args){
    
        Scanner scan = new Scanner( System.in );
        
        int[] idades = new int[10]; 
        
        for( int i = 0; i < idades.length; i++){
            System.out.println("Digite a idade da " + (i + 1) + "ª pessoa");
            idades[i] = scan.nextInt();
        }
        
        int menorIdade = idades[0];
        int indexMenor = 0;
        int maiorIdade = idades[0];
        int indexMaior = 0;
        
        for(int i = 1; i < idades.length; i++){

            if(idades[i] > maiorIdade){
                maiorIdade = idades[i];
                indexMaior = i;
            } else if( idades[i] < menorIdade ){
                menorIdade = idades[i];
                indexMenor = i;
            }
        }
        
        System.out.println();
        
        System.out.printf("A menor idade é %d\n", menorIdade);
        System.out.printf("O índice da menor idade é %d\n", indexMenor);
        System.out.printf("A maior idade é %d\n ", maiorIdade);
        System.out.printf("O índice da maior idade é %d\n", indexMaior);
        
    }
}
