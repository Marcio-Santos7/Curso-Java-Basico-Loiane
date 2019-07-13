/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula18;

import java.util.Scanner;

/**
 *
 * @author SONY VAIO
 */
public class BreakEContinue {
    
    public static void main ( String[] args ){
    
        /*Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um número");
        int num = scan.nextInt();
        
        System.out.println("Entre com um limite");
        int max = scan.nextInt();
        
        for (int i=num; i<=max; i++){
        
            if (i % 7 == 0) {
                System.out.println("O valor de i é: " + i);
                break;
            }
        }*/
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um número");
        int num = scan.nextInt();
        
        System.out.println("Entre com um limite");
        int max = scan.nextInt();
        
        for (int i=num; i<=max; i++){
        
            if (i % 7 == 0) {                
               continue;
            }
            System.out.println("O valor de i é: " + i);
        }
    }
}
