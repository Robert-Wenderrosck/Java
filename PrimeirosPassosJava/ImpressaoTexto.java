package PrimeirosPassosJava;

public class ImpressaoTexto {
	public static void main(String[] args) {
		
		System.out.print("Olá, mundo!\n");
		
		//ln - posiciona o cursor na linha de baixo
		System.out.println("Texto simples");
		System.out.println("Texto simples 2");
		
		/*
		  f - formatted (Formato que permite fazer impressão personalizada
		 %s - string (text0)
		 %d - inteiro
		 %f - float (casas decimais
		 %b - boleano (TRUE ou FALSE)
		 		 
		 */
		
		System.out.printf("%s", "Nome: Ana Paula\n");
		System.out.printf("%s - %d", "Nome: Ana Paula", 25);
		
		int numero1 = 5;
		int numero2 = 10;
		
		System.out.printf("\n\nSoma dos números: %d", (numero1 + numero2));
		
	}

}
