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
public class Exer07 {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite a medida do lado do quadrado: ");
        double lado = scan.nextDouble();
        
        //area = lado * lado
        double area = Math.pow(lado, 2);
        
        System.out.println("A área do quadrado é: " + area);
        
        double areaqua = 2 * area;
        
        System.out.println("O dobro da área do quadrado é: " + areaqua);
    }
}
