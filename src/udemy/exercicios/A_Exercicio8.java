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
 *	Erro de compila��o
 *
 */
public class A_Exercicio8 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3 };
		int[] b = { 1, 2, 3, 4 };
		
		// "a" a esquerda � avaliado primeiro, ou seja, array "b" � atribuido a "a", indice [2] do array "b" � 3, indice do array "a" tamb�m � 3
		System.out.println(a[(a = b)[2]]);
	}

}