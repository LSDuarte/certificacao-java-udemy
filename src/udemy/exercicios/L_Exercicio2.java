package udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 2: Qual a saida?
 *
 *	-1-23
 *	-1-2 (x)
 *	Erro de compilação
 *	Exception
 *
 */
public final class L_Exercicio2 {

	public static void main(String[] args) {
		int a[][] = { { -1, -2 }, { 3 }, { -3, -4 }, { 1, 2 } };

		a: for (int[] b : a) {
			for (int i = 0; i < b.length; i++) {
				if (b[i] > 0)
					break a;
				System.out.print(b[i]);
			}
		}
	}

}