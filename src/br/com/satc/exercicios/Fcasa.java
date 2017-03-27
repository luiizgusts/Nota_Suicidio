package br.com.satc.exercicios;

import java.util.Scanner;

public class Fcasa {
    public static void main(String[] args) {
         Scanner read = new Scanner (System.in);
          System.out.println("Qual o seu sexo? (F (Mulher)/M (Homem)");
           String sexo = read.next();
           if(sexo.toUpperCase().equals("F")) {
               System.out.println("Qual seu estado civil?");
               String estado = read.next();
                if(estado.toUpperCase().equals("CASADA")){
                    System.out.println("Quantos anos você está casada?");
               String anos = read.next();
                    System.out.println("A pergunt não teve utilidade.");
              }
         }
    }
}
