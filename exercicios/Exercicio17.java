package exercicios;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
	
		System.out.print("Digite um número:");
		int numero = scn.nextInt();
		
		System.out.print("Digite um outro número:");
		int numero2 = scn.nextInt();
		
		int soma = numero + numero2;
		
		System.out.println("O resultado da soma dos números é " + soma);
		scn.close();
		
	             
	}

}
