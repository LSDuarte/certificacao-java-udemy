/**
 * 
 */
package udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 10: Qual a saída ao executar o comando java Main 1 2 3
 *
 *	1 
 *	2 (X) No exercicio da esse aqui
 *	3
 *	Erro de compilação
 *	Exception (X)
 *
 */
public class A_Exercicio10 {
	
	public static void main(String[][] args) {
		System.out.println(args[0][1]);
	}

	public static void main(String[] args) {
		A_Exercicio10 main = new A_Exercicio10();
		String[][] args2 = { args };
		main.main(args2);
	}
}