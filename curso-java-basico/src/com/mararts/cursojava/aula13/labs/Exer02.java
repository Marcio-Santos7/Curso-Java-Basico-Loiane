/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * Utilização do Scanner para obter valores do teclado.
 * @author Marcio Leandro
 */
public class Exer02 {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Entre com um número inteiro: ");
        
        int numero = scan.nextInt();
        System.out.println("O número informado foi: " + numero);
        
        
    }
}
