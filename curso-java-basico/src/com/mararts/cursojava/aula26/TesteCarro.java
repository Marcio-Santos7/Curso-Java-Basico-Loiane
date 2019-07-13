/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula26;

/**
 *
 * @author SONY VAIO
 */
public class TesteCarro {
    
    public static void main (String[] args) {
    
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        van.exibirAutonomia();
        double autonomia = van.obterAutonomia();
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println("A autonomia do carro é: " + autonomia);
        
        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;
        fusca.exibirAutonomia();
        
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
    }
}
