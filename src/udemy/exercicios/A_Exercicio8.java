package udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 8: Qual a saida?
 *
 *	1
 *	2
 *	3 (X)
 *	4 
 *	Erro de compilação
 *
 */
public class A_Exercicio8 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3 };
		int[] b = { 1, 2, 3, 4 };
		
		// "a" a esquerda é avaliado primeiro, ou seja, array "b" é atribuido a "a", indice [2] do array "b" é 3, indice do array "a" também é 3
		System.out.println(a[(a = b)[2]]);
	}

}