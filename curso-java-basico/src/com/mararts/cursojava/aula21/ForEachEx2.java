/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mararts.cursojava.aula21;

/**
 *
 * @author SONY VAIO
 */
public class ForEachEx2 {
    public static void main (String[] args) {
    
         double[][] notasAlunos = new double[3][4];
        
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;
        
        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;
        
        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;
        
        for ( double[] notasAluno : notasAlunos) {
            for (double nota : notasAluno) {
                System.out.print(nota + " ");
            }
            
            System.out.println();
        }
    }
}
