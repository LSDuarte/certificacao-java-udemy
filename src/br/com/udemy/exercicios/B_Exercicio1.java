/**
 * 
 */
package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 * 
 * 		java b�sico
 *
 *		Pergunta 1 - Qual a saida do c�digo abaixo?
 *
 *		* 4
 *		* 6
 *		* 0
 * 		* Erro de compila��o na linha 3 (X)
 * 		* Erro de compila��o na linha 4
 * 		* Exception
 * 
 */
public class B_Exercicio1 {

	public static void main(String[] x) {

	//	int [] x = {4,5,6};
		
		System.out.println(x[0]); // 0 >> 4, 1 >> 5, 2 >> 6
		
		System.out.println(x[4]); // n�o existe posi��o 4 no vetor
	}

}