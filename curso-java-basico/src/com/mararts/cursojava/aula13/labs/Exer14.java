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
public class Exer14 {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o tamanho de um arquivo para download em MB: ");
        double tamanhoArquivo = scan.nextDouble();
        
        System.out.println("Entre com a velocidade do link de internet em Mbps");
        double velocidadeLink = scan.nextDouble();
        
        double tempo = tamanhoArquivo / velocidadeLink;
        System.out.println("O tempo de download é igual a: " + tempo);
    }
}
