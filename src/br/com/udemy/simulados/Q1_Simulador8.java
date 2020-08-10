/**
 * 
 */
package br.com.udemy.simulados;

/**
 * @author LSDuarte
 *
 *	Pergunta 8: Qual a saida?
 *
 *	1 2 3
 *	3 2 1
 *  2 3 1
 *  1 2 
 *  3 1 (x)
 */
public class Q1_Simulador8 {

	public static void main(String args[]) {
		System.out.println("1 "); // imprime segundo
	}

	{
		System.out.println("2 "); // não imprime.
	};

	static {
		System.out.print("3 "); // imprime primeiro
	};
}
