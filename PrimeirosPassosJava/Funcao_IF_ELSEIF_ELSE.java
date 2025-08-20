package ComandosDecisaoJava;
import java.util.Scanner;

public class Funcao_IF_ELSEIF_ELSE {
	
	public static void main(String[] args) {
		
		//Scanner - Objeto da classe
		//System.in - Lê as informações do teclado
		Scanner objetoNota = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a nota 1");
		nota1 = objetoNota.nextDouble();
		
		System.out.println("Digite a nota 2");
		nota2 = objetoNota.nextDouble();
		
		System.out.println("Digite a nota 3");
		nota3 = objetoNota.nextDouble();
		
		System.out.println("Digite a nota 4");
		nota4 = objetoNota.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media >= 7) {
			
			System.out.println("Média: " + media + " - Situação: Aprovado(a)");
			
		}
		else if(media >= 2) {
			
			System.out.println("Média: " + media + " - Situação: Recuperação");
			
		}
		else {
			
			System.out.println("Média: " + media + " - Situação: Reprovado(a)");
			
		}
		
	}

}
