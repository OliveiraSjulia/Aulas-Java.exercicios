package exercicios;

import java.util.Scanner;

public class Exercicio13 {
public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Ol� vamos calcular a sua m�dia ponderada "
				+"\n" + "Digite a sua primeira nota: ");
		double n1 = scn.nextDouble();
		System.out.print("Agora Digite a sua segunda nota: ");
		double n2 = scn.nextDouble();
		System.out.print("Agora Digite a sua terceira nota: ");
		double n3 = scn.nextDouble();
		
		double mediaP = (n1 * 2 + n2 * 3 + n3 * 5)/10;
		
		System.out.println("A sua m�dia �: " + mediaP);
		scn.close();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
