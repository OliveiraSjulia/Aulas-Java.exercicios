package exercicios;
import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Digite um n�mero: ");
		int n1 = scn.nextInt();
		
		System.out.print("Digite mais um n�mero: ");
		int n2 = scn.nextInt();
		
		if (n1>n2) {
			System.out.println("O maior n�mero � " + n1);
			
		} else if(n2>n1) {
			System.out.println("O maior n�mero � " + n2);
			
		}else if (n1 == n2){
			System.out.println("N�o digite n�meros iguais seu animal kkk");
			
			scn.close();

		}
		
		
			
		}
}
