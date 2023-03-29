package edu.java.desafios01;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		int numero1, numero2, soma;
		System.out.println("Digite um número: ");
		numero1 = scan.nextInt();
        System.out.println("Digite um número: ");
		numero2 = scan.nextInt();
		 
		soma = numero1 + numero2;   

		System.out.println("Soma = " + soma);
	}
}

