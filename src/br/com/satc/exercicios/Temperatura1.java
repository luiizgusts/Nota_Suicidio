package br.com.satc.exercicios;

import java.util.Scanner;

public class Temperatura1 {
    public static void main(String[] args) {
        System.out.println("Digite a temperatura a ser transformada: ");
        Scanner fer = new Scanner (System.in);
        float temperatura = fer.nextFloat();
        float celsius = (float) ((temperatura-32)/1.8);
        System.out.println("A temperatura em celsius é "+celsius+".");
        
    }
    
}
