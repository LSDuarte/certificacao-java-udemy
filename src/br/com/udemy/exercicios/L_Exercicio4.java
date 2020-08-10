package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 4: Qual a saida?
 *
 *	1-2
 *	1
 *	1-3 (ENTENDER O PORQUE)
 *	Erro de compilação
 *	O programa vai entrar em loop infinito
 *
 */
public class L_Exercicio4 {

	public static void main(String[] args) {

		int a = 8;
		while (a > 0) {
			do {
				a -= 3;
			} while (a > 4);
			a--;
			System.out.print(a);
		}

	}

}