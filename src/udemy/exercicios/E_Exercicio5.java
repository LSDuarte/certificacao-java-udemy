package udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 5: Qual a saida?
 *
 *	NullPointerException
 *	ArithmeticException
 *	0
 *	Erro de compilação
 *	Nenhuma das anteriores
 *
 */
public class E_Exercicio5 {

	static Integer a;

	public static void main(String[] args) {
		try {
			System.out.println(a / 0);
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println(e.getClass().getSimpleName());
		}
	}

}