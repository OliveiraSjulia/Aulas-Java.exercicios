package exercicios;
import java.time.LocalDate;
import java.util.Scanner;
public class Exercicio26 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int anoAtual = LocalDate. now (). getYear();
		System.out.println("As elei��es de " + anoAtual + " come�aram em breve");
	   
		System.out.print("Por favor Digite o ano em que voc� nasceu: ");
		int ano = scn.nextInt();
	
		
		if (ano > 2005 ) {
			System.out.println("Voc� n�o poder� votar esse ano :(");
			
		} else if (ano < 2005 ){
			System.out.println("Voc� poder� votar esse ano :)");
			scn.close();
			

		} 
	}
}
