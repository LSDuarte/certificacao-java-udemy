package udemy.exercicios;

/**
 * @author LSDuarte
 * 
 * 	Pergunta 8: Qual a saída?
 * 
 * 	0
 * 	1 (X)
 * 	2
 * 	3
 * 	Erro de compilação
 *
 */
public class O_Exercicio8 {

	public static void main(String[] args) {

		int a = 0;
		boolean bool = false;
		bool = false & maiorQueZero(a++);
		bool = true && maiorQueZero(a--);
		bool = true | maiorQueZero(a++);
		bool = true || maiorQueZero(a++);
		System.out.println(a);

	}

	public static boolean maiorQueZero(int a) {
		return a > 0 ? true : false;
	}

}