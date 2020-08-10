package br.com.udemy.javabasico;

/**
 * @author LSDuarte
 *
 */
public class WhileEDoWhile {

	public static void main(String[] args) {

		// condição while não será executado, pois o valor 5 é menor que 6, condição while testa antes de executar.
		int x = 5;
		while (x > 6) {
			System.out.println("o valor é: " + x);
		}
		
		
		// do while irá executar pelo menos uma vez, pois ele testa depois de executar a condição, vai imprimir 5
		do {
			System.out.println("o valor é: "+ x);
		} while (x > 6);
		
	}

}