package edu.java.desafios01;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		double nota1, nota2, media;
		System.out.print("Digite uma nota: ");
		nota1 = scan.nextDouble();
        System.out.print("Digite uma nota: ");
		nota2 = scan.nextDouble();
		 
		media = (nota1 * 3.5 + nota2 * 7.5)/11;   

		System.out.printf("MEDIA = %.5f", media);
        System.out.println();
	}
}

