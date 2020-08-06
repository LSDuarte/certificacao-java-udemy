package udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 7: Qual a saída?
 *	
 *	A/B
 *	AB
 *	/AB
 *	AB/ (x)
 *	Erro de compilação
 */
public class API_Exercicio7 {

	public static void main(String[] args) {

		String a = String.join("/", "A", "B"); // metodo join, argumento 1 (/) unifica os outros dois A, B
		System.out.println(a);

	}

}