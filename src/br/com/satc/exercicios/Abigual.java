package br.com.satc.exercicios;

import java.util.Scanner;

public class Abigual {
    public static void main(String[] args) {
        System.out.println("Digite os valores A e B respectivamente.");
         Scanner read = new Scanner (System.in);
           float a = read.nextFloat(), b = read.nextFloat();
             if(a==b){
                 System.out.println("O valor de A+B fica "+(a+b)+".");
             } else {
                 System.out.println("O valor de A*B fica "+(a*b)+".");
             }
    }   
}
