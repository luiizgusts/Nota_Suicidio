package br.com.satc.exercicios;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        System.out.println("Digite sua altura (em metros)");
        Scanner read = new Scanner (System.in);
         double altura = read.nextDouble();
         System.out.println("Digite seu peso (em kg)");
          double peso = read.nextDouble();
        double imc = peso/(altura)*2;
        if(imc<18.5){
            System.out.println("Você é abaixo do peso.");
        } else if ((imc>18.5) && (imc<25)){
            System.out.println("Seu peso é normal.");
        } else if ((imc>25 && imc<30)){                   
            System.out.println("Você é acima do peso.");        
    } else if (imc>30){
            System.out.println("Você é obeso."); 
       }
    }
}
    