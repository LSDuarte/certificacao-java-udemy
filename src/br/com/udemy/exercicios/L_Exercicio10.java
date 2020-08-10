package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *	
 *	Pergunta 10: Qual a saída?
 *
 *	0
 *	1
 *	12
 *	Erro de compilação
 *	Loop infinito
 */
public class L_Exercicio10 {

	public static void main(String[] args) {

		int a;
		while ((a = 0) <= 2) {
			System.out.print(a);
			a++;
		}

	}

}