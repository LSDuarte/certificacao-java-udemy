package br.com.udemy.javabasico;

/**
 * @author LSDuarte
 *
 */
public class WhileEDoWhile {

	public static void main(String[] args) {

		// condi��o while n�o ser� executado, pois o valor 5 � menor que 6, condi��o while testa antes de executar.
		int x = 5;
		while (x > 6) {
			System.out.println("o valor �: " + x);
		}
		
		
		// do while ir� executar pelo menos uma vez, pois ele testa depois de executar a condi��o, vai imprimir 5
		do {
			System.out.println("o valor �: "+ x);
		} while (x > 6);
		
	}

}