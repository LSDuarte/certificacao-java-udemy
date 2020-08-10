/**
 * 
 */
package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 * 
 * 		java básico
 *
 *		Pergunta 1 - Qual a saida do código abaixo?
 *
 *		* 4
 *		* 6
 *		* 0
 * 		* Erro de compilação na linha 3 (X)
 * 		* Erro de compilação na linha 4
 * 		* Exception
 * 
 */
public class B_Exercicio1 {

	public static void main(String[] x) {

	//	int [] x = {4,5,6};
		
		System.out.println(x[0]); // 0 >> 4, 1 >> 5, 2 >> 6
		
		System.out.println(x[4]); // não existe posição 4 no vetor
	}

}