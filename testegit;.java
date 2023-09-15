package ex01;

import java.util.Scanner;

public class ex01pq {

	public static void main(String[] args) {

// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos
		 	System.out.println("Digite dois valores: ");	
		
			Scanner sc = new Scanner(System.in);
		 	
			int x, y, z;
			x = sc.nextInt();
			y = sc.nextInt();
			z = x + y;
			System.out.println("Entrada: " + x + " e "+ y);
			System.out.println("SOMA = " + z);
	}

}