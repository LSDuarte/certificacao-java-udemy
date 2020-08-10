package br.com.udemy.operadores;

/**
 * @author LSDuarte
 * 
 * 		& e | sempre executam os dois lados da operação
 * 		&& só executa a expressão da direita se a primeira expressão for TRUE
 * 		|| só executa a expressão da direita se a prmeira expressão for FALSE.
 *
 */
public class OperadoresEEeOU {

	public static void main(String[] args) {

		int a = 0, b = 1;
		
		boolean c = b != 1 & a++ > 0; // ambas expressões serão executadas.
		boolean d = b != 1 && a++ > 0; // somente a primeira expressao sera executada pois ela é false.
		
		boolean e = b == 1 | a++ > 0; // ambas expressões serão executadas.
		boolean f = b == 1 || a++ >0; // somente a primeira expressao sera executada pois ela é false.
		
		System.out.println(a); // resultado 2
	}

}