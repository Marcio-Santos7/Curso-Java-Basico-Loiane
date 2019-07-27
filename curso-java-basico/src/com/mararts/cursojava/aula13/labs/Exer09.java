/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * Conversão de temperatura Farenheit para Celsius.
 * @author Marcio Leandro
 */
public class Exer09 {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite a temperatura em graus Farenheit: ");
        double tempFarenheit = scan.nextDouble();
        
        double tempCelsius = (5 * (tempFarenheit - 32)/9);
        
        System.out.println("A temperatura " + tempFarenheit + " F é igual a " + 
                tempCelsius + " C");
    }
}
