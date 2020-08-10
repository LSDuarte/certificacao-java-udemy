package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 * 
 * 	Pergunta 9: Qual a saída?
 * 
 * 	0
 * 	1
 * 	Erro de compilação
 * 	Exception
 *
 */
public class M_Exercicio9 {
	static int a = 1;

	public static void zerar(int a) {
		a = 0;
	}

	public static void main(String[] args) {

		zerar(a);
		System.out.print(a);

	}

}