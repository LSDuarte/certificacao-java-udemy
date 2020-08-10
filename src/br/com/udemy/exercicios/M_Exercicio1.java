package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 1: Que trecho de código deve ser inserido no lugar do comentário para que não ocorra erro de compilação?
 *
 *	private String metodo();
 *	private void metodo();
 *	private static String metodo(); (X)
 *	private static void metodo();
 *	Nenhuma das anteriores
 */
public class M_Exercicio1 {

	public static void main(String args[]) {
		System.out.print(metodo());
	}

	private static String metodo() {
		// insira trecho de código aqui
		return "Ola Mundo!!";
	}
}