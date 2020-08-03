package udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 1: Qual a saida?
 *
 *	1 (X)
 *	2
 *	3
 *	Erro de compilação
 *	Exception
 *
 *
 */
public class A_Exercicio1 {

	static int a;

	public static void main(String[] args) {

		int b[] = new int[] { 1, 2, 3 };
		System.out.print(b[a++]);

	}

}