package exercicios;

import java.util.Scanner;

public class Exercicio14 {
public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = scn.nextInt();
		
		if (n>10) {
			System.out.println( n + " É MAIOR QUE 10 ");
		
		}
		else if (n<10) {
			System.out.println("É MENOR QUE 10");
			scn.close();
			
		}
		
		
		}
		
}
