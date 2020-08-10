package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 8: Qual a saida?
 *
 *	0
 *	1
 *	2
 *	3
 *	4	
 *	Erro de compilação (x)
 *
 */
public class L_Exercicio8 {

	static String[] a = { "1", "2", "3" };

	public static void main(String[] args) {

		int i = 0;
		for (String s : a) {
			if (i == 2) {
				break;
			} else {
				continue; // vai causar um erro de compilação.
			}
	//		i++;
		}
		System.out.println(i);

	}

}