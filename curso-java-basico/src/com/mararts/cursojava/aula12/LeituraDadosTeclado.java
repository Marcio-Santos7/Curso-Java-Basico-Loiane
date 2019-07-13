/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula12;

import java.util.Scanner;

/**
 *
 * @author SONY VAIO
 */
public class LeituraDadosTeclado {
    
    public static void main(String[] args){
      
        Scanner scan = new Scanner(System.in);
        
       /* System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);
        
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);
        
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade + " anos");*/
        
        System.out.println("Digite a sua altura: ");
        float altura = scan.nextFloat();
        System.out.println("Sua altura é: " + altura);
    }
}
