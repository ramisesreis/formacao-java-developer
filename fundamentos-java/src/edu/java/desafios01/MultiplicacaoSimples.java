package edu.java.desafios01;

import java.util.Scanner;

public class MultiplicacaoSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		int numero1, numero2, produto;
		System.out.println("Digite um número: ");
		numero1 = scan.nextInt();
        System.out.println("Digite um número: ");
		numero2 = scan.nextInt();
		 
		produto = numero1 * numero2;   

		System.out.println("Produto = " + produto);
	}
}

