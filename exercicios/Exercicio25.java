package exercicios;
import java.util.Scanner;
public class Exercicio25 {
public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Ol� Aluno irei Calcular a sua M�dia" + "\n"
		+ "Por favor Digite a sua primeira nota:");
		
		int nota = scn.nextInt();

		System.out.print("Agora digite a sua segunda nota:");
		int nota2 = scn.nextInt();
		
		int mediaA = (nota + nota2)/2;  
		
		
		if (mediaA<6) {
			System.out.println("A sua m�dia � " + mediaA +" Voc� foi REPROVADO!!");
			
		} else if(mediaA>6){
			System.out.println("SUA M�dia � "+ mediaA+ " Parab�ns voc� foi APROVADO!!");
			scn.close();
			

		}
		
		
		
		
		
		
	}
}
