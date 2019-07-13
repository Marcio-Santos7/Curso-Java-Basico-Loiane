/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula29;

/**
 *
 * @author SONY VAIO
 */
public class Carro {
    String marca;
    String modelo;
    int numPassageiros;  // número de passageiros
    double capCombustivel;  // capacidade do tanque de combustível
    double consumoCombustivel;  // consumo de combustível por km
    
    Carro() {};
    
    void exibirAutonomia() { 
    
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km");
    }
    
    double obterAutonomia() {
        
        System.out.println("Método obterAutonomia foi chamado");
    
        return capCombustivel * consumoCombustivel;
    }
    
    double calcularCombustivel(double km) {
    
        double qtdCombustivel = km/consumoCombustivel;
        
        return qtdCombustivel;
    }
}
