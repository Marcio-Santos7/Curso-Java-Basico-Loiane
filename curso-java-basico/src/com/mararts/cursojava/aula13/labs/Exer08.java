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
public class Exer08 {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Quanto você ganha por hora?");
        double ganhoHora = scan.nextDouble();
        
        System.out.println("Quantas horas você trabalha no mês?");
        double horaMes = scan.nextDouble();
        
        double  salarioMensal = ganhoHora * horaMes;
        
        System.out.println("O valor total do salário mensal é: " + salarioMensal);
    }
}
