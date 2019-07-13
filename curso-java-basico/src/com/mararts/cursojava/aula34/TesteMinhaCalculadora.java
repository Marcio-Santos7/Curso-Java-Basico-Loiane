/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula34;

/**
 *
 * @author SONY VAIO
 */
public class TesteMinhaCalculadora {
    public static void main(String[] args){
    
        MinhaCalculadora calc = new MinhaCalculadora();
        
       int soma1 = calc.soma(1, 2);
       System.out.println(soma1);
       
       double soma2 = calc.soma(2.0, 1.3);
       System.out.println(soma2);
    }
}
