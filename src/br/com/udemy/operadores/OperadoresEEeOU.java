package br.com.udemy.operadores;

/**
 * @author LSDuarte
 * 
 * 		& e | sempre executam os dois lados da opera��o
 * 		&& s� executa a express�o da direita se a primeira express�o for TRUE
 * 		|| s� executa a express�o da direita se a prmeira express�o for FALSE.
 *
 */
public class OperadoresEEeOU {

	public static void main(String[] args) {

		int a = 0, b = 1;
		
		boolean c = b != 1 & a++ > 0; // ambas express�es ser�o executadas.
		boolean d = b != 1 && a++ > 0; // somente a primeira expressao sera executada pois ela � false.
		
		boolean e = b == 1 | a++ > 0; // ambas express�es ser�o executadas.
		boolean f = b == 1 || a++ >0; // somente a primeira expressao sera executada pois ela � false.
		
		System.out.println(a); // resultado 2
	}

}