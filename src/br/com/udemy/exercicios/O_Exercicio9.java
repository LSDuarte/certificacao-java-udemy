package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 9: Qual a saida do código?
 *
 *	Erro de compilação
 *	1
 *	0
 *	66
 *	61 (X) // valor inicial de a é 1,  somando atribui a = 5 +  (5* 5+7) = 61
 *
 */
public class O_Exercicio9 {

	public static void main(String[] args) {

		int a = 1;
	    a += (a = 5) * (a + 7);
	    System.out.println(a);
		
	}

}