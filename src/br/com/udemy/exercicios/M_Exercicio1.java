package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 1: Que trecho de c�digo deve ser inserido no lugar do coment�rio para que n�o ocorra erro de compila��o?
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
		// insira trecho de c�digo aqui
		return "Ola Mundo!!";
	}
}