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
public class Exer10 {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite a temperatura em graus celsius: ");
        double tempCel = scan.nextDouble();
        
        double tempFar = (((9 * tempCel)+160))/5;
        
        System.out.println("A temperatura " + tempCel + "C em Farenheit é igual a " + tempFar + "F");
    }
}
