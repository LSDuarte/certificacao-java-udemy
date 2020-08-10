package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 4: Qual a saida?
 *
 *	0
 *	1 (X)
 *	2
 *	Erro de compilação
 *	Exception
 */
public class M_Exercicio4 {

	public static void main(String[] args) {
		int[] a = { 1, 1 };
		zerar(a[1]);
		zerar(a);
		System.out.println(a[0] + a[1]);
	}

	public static void zerar(int a) {
		a = 0;
	}

	public static void zerar(int a[]) {
		a[1] = 0;
	}
}