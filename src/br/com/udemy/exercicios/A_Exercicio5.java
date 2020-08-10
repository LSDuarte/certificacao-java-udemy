package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 5: Qual a saida?
 *	
 *	6
 *	7
 *	8 (X)
 *	Erro de compilação
 *	Exception
 *
 */
public class A_Exercicio5 {

	public static void main(String[] args) {
		int a[][] = new int[3][]; // 3 dimensões com 3 linhas, a.length resulta em 3
		System.out.println(a.length); //3
		
		a[0] = new int[4];
		System.out.println(a.length); //3
		a[1] = new int[5];
		System.out.println(a.length); //3

		System.out.print(a.length + a[1].length); // ele soma 3 + 5
	}

}