package udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 10: Qual saida?
 *
 *	12
 *	123
 *	23	
 *	Erro de compilação
 *	2 e será lançada uma exception
 *
 */
public class E_Exercicio10 {

	public static void main(String[] args) {

	/*
		try {
			metodo();
			System.out.print("1");
		} finally {
			System.out.print("2");
		}
		System.out.print("3");

	 */
	}
		
	public static void metodo() throws Exception {
		throw new Exception();
	}
}