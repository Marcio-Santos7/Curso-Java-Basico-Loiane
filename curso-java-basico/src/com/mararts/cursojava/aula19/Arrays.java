/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula19;

/**
 *
 * @author SONY VAIO
 */
public class Arrays {
    
    public static void main(String[] args){
        
        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;
        double tempDia006 = 32.8;
        double tempDia007 = 30;
        double tempDia008 = 29.8;
        double tempDia009 = 31.5;
        
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;
        
        System.out.println("O valor da temperatura do dia 3 é: "+ temperaturas[2]);
        
        System.out.println("O tamanho do array: "+ temperaturas.length);
    
    }
    
}
