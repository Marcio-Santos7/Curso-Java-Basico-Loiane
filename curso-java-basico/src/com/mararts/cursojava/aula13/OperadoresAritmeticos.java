/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula13;

/**
 * Utilizando operadores aritméticos.
 * @author Marcio Leandro 
 */
public class OperadoresAritmeticos {
    
    public static void main(String[] args){
    
        int resultado = 1 + 2;
        System.out.println(resultado);
        
        resultado = resultado - 1;
        System.out.println(resultado);
        
        resultado = resultado * 2;
        System.out.println(resultado);
        
        resultado = resultado / 2;
        System.out.println(resultado);
        
        resultado = resultado + 8;
        System.out.println(resultado);
        
        resultado = resultado % 7;
        System.out.println(resultado);
        
        String primeiroNome = "Esta é ";
        String segundoNome = "uma String concatenada. ";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);
        
        resultado = resultado + 1;
        System.out.println(resultado);
        
        resultado++;
        System.out.println(resultado);
        
        //5
        System.out.println(resultado++);
        //mesma coisa que
        System.out.println(resultado);
        resultado = resultado + 1;
        resultado += 1;
        
        System.out.println(++resultado);
        
        resultado--;
        System.out.println(resultado);
        
        System.out.println(resultado--);
        System.out.println(--resultado);
    }
    
}
