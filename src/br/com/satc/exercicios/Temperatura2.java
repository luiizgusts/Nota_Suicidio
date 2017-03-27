package br.com.satc.exercicios;

import java.util.Scanner;

public class Temperatura2 {
    public static void main(String[] args) {
        System.out.println("Digite a temperatura a ser transformada: ");
        Scanner fer = new Scanner (System.in);
        float temperatura = fer.nextFloat();
        float celsius = (float) ((temperatura*1.8)+32);
        System.out.println("A temperatura em Fahrenheit é "+celsius+".");
    }
    
}
