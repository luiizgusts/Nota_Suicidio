package br.com.satc.exercicios;

import java.util.Scanner;

public class Raio {
    public static void main(String[] args) {
     double raio1,circulo;     
        double pi = Math.PI;
        System.out.println("Digite o valor do raio: ");
         Scanner raio = new Scanner (System.in);
          raio1 = raio.nextFloat();
        circulo=pi*(raio1*raio1);
        System.out.println("O valor do circuo é "+circulo+".");
        
          
        
    }
}
