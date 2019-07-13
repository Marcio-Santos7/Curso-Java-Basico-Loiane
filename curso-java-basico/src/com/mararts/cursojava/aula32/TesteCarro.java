/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula32;

/**
 *
 * @author SONY VAIO
 */
public class TesteCarro {
    
    public static void main( String[] args){
    
        Carro van = new Carro();
        
        van.setMarca("Fiat");
        
        System.out.println("A marca da van é " + van.getMarca());
    }
}
