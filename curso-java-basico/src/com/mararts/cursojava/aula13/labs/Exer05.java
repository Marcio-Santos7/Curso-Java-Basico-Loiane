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
public class Exer05 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner (System.in);
    
        System.out.println("Entre com a medida em metros: ");
        double medidaMet = scan.nextDouble();
        
        // 1m = 100cm
        double medidaCent = medidaMet*100;
        System.out.println("A medida em centímetros é: " + medidaCent + " cm");
    }
}
