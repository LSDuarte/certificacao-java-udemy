package udemy.exercicios;

/**
 * @author LSDuarte
 * 
 *         Pergunta 7: Qual a sa�da do c�digo?
 *
 *         a B b defaut 
 *         B default 
 *         B b default (X)  // como n�o existe "BREAK" em nenhum dos cases, ele passa pelo B e pelo b
 *         Erro de compila��o
 *
 */
public class O_Exercicio7 {

	public static void main(String[] args) {

		String a = "B";
		switch (a) {
		case "a":
			System.out.print("a ");
		case "B":
			System.out.print("B ");
		case "b":
			System.out.print("b ");
		default:
			System.out.print("default ");
		}

	}

}