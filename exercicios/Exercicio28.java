package exercicios;
import java.util.Scanner;

public class Exercicio28 {
	public static void main (String[]args) {
		
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		int n1 = scn.nextInt();
		
		System.out.print("Digite mais um número: ");
		int n2 = scn.nextInt();
		
		if (n1<n2) {
			System.out.println("A ordem crescente é " + n1 + ", " + n2);
			
		} else if (n2<n1){
			System.out.println("A ordem crescente é " + n2 + ", " + n1);
			
		}else if (n1 == n2){
			System.out.println("Não digite numeros iguais kkk xaropão");

		}
		
		
		
		
		
 }
}
