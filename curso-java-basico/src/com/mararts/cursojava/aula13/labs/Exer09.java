/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author SONY VAIO
 */
public class Exer09 {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite a temperatura em graus Farenheit: ");
        double tempFar = scan.nextDouble();
        
        double tempCel = (5 * (tempFar - 32)/9);
        
        System.out.println("A temperatura " + tempFar + " F é igual a " + tempCel + " C");
    }
}
