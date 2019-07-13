/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula17;

/**
 *
 * @author SONY VAIO
 */
public class LoopFor {
    
    public static void main (String[] args){
    
        for (int i = 0; i < 5; i++ ){
            System.out.println("i tem valor: " + i);
        }
        
        for (int i = 0, j = 10; i < j; i++, j--){
            System.out.println("i = " + i + "; j" + j);
        }
    }
}
