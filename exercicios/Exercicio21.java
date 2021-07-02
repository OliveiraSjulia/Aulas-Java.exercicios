package exercicios;
import java.util.Scanner;

public class Exercicio21 {
    public static void main (String[]args) {
    	Scanner scn = new Scanner(System.in);
    	
    System.out.print("Digite um número: ");
    int n = scn.nextInt();
    
     if (n==0) {
    	System.out.println("É POSITIVO");
 
     }else if (n > 0) {
		System.out.println("É NEGATIVO");
		scn.close();
    
     }
    }
}

