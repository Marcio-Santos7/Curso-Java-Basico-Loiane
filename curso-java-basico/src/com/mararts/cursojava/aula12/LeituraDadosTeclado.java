/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula12;

import java.util.Scanner;

/**
 * Utilizando a classe Scanner.
 * @author Marcio Leandro
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
        System.out.println("Sua idade é: " + idade + " anos");
        
        System.out.println("Digite a sua altura: ");
        float altura = scan.nextFloat();
        System.out.println("Sua altura é: " + altura); */
        
        System.out.println("Digite o seu primeiro nome, idade, "
                + "quantidade de filhos, "
                + "altura e se tem bichinho de estimação");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();
        
        System.out.println( "Você digitou os seguintes valores: " );
        System.out.println( "Primeiro Nome: " + primeiroNome );
        System.out.println( "Idade: " + idade );
        System.out.println( "Quantidade de filhos: " + qtdFilhos );
        System.out.println( "Altura: " + altura );
        System.out.println( "Tem bichinho de estimação? " + temPet );
    }
}
