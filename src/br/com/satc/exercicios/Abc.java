package br.com.satc.exercicios;

import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {
        System.out.println("Digite o valor de A, B, C respectivamente: ");
         Scanner abc = new Scanner (System.in);
         
          float a = abc.nextFloat(), b = abc.nextFloat(), c = abc.nextFloat();
          if(a+b<c){
              System.out.println("A+B é menor do que C.");
          } else {
              System.out.println("A+B não é menor do que C.");
          }
       
    }
    
}
