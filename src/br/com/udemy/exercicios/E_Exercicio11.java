package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 11: Qual a saida?
 *
 *	12
 *	23 (X)
 *	123
 *	Erro de compila��o
 *	2 e ser� lan�ado uma Exception
 *
 *
 */
public class E_Exercicio11 {

	public static void main(String args[]) throws Exception {
		try {
			metodo();
			System.out.print("1");
		} catch (Exception e) {

		} finally {
			System.out.print("2");
		}
		System.out.print("3");
	}

	public static void metodo() throws Exception {
		throw new Exception();
	}
	
	// 

}