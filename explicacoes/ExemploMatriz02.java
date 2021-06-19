package explicacoes;

public class ExemploMatriz02 {

	public static void main(String[] args) {
	int [][] numero= {{28,77,19,34},{3,6,17,32}};
	
	for(int i=0;i<numero.length;++i) {
		for(int e=0;e<numero[i].length;++e) {
			System.out.println(numero[i][e]);
		}
	}
		
	}
}
