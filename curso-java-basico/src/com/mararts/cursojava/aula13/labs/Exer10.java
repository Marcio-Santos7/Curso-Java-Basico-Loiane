/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * Conversão de temperatura Celsius para Farenheit.
 * @author Marcio Leandro
 */
public class Exer10 {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em graus celsius: ");
        double tempCelsius = scan.nextDouble();
        
        double tempFarenheit = (((9 * tempCelsius)+160))/5;
        
        System.out.println("A temperatura " + tempCelsius + 
                "C em Farenheit é igual a " + tempFarenheit + "F");
    }
}
