package br.com.udemy.tiposdedados;

/**
 * @author LSDuarte
 * Tipos de dados, para variaveis o Underscore só se usa entre números.
 */
public class Underscore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Válidos
		int a = 1_23;
		double b = 1___23;
		
		System.out.println( a + b);
		
		//Inválidos
//		int c = _123;
//		double d = 12._34;
		
	}

}
