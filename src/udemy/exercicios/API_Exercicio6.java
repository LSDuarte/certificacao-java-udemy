package udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 6: Qual a saída?
 *
 *	AB
 *	AC
 *	CB
 *	ACB (X)
 *	ABC
 */
public class API_Exercicio6 {

	public static void main(String[] args) {

		StringBuilder a = new StringBuilder("AB");
		a.insert(1, "C"); // 0=A,1=C,B=2
		System.out.println(a);

	}

}