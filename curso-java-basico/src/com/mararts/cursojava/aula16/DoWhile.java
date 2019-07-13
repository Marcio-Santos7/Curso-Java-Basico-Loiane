/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula16;

/**
 *
 * @author SONY VAIO
 */
public class DoWhile {
    
    public static void main (String[] args){
    
        int i = 1;
       
        do{
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 15);
        
        System.out.println(i);
    }
    
}
