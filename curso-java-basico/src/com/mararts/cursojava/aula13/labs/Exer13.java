/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula13.labs;

import java.util.Scanner;

/**
 * Cálculo do salário bruto, INSS, sindicato, IR, total de descontos e salário 
 * líquido.
 * @author Marcio Leandro
 */
public class Exer13 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quanto você ganha por hora?");
        double ganhoHora = scan.nextDouble();
        
        System.out.println("Quantas horas você trabalhou no mês?");
        double horasMes = scan.nextDouble();
        
        double salarioBruto = (ganhoHora * horasMes);        
        double descontoIR = 0.11 * salarioBruto;        
        double inss = 0.08 * salarioBruto;       
        double sindicato = 0.05 * salarioBruto;   
        double totalDescontos = descontoIR + inss + sindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        
        
        System.out.println("O desconto do INSS é igual a: " + inss);
        System.out.println("O desconto do sindicato é igual a: " + sindicato);
        System.out.println("O salário líquido é igual a: " + salarioLiquido);
        System.out.println("O total de descontos é igual a: " + totalDescontos);
    }
}
