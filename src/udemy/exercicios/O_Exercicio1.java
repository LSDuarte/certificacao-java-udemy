package udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 1: Que código deve ser inserido no println para imprimir -2?
 *
 *	a++ + ++b
 *	a-- + ++b
 *	a-- . --b
 *	a++ + --b (x)
 *		
 *
 */
public class O_Exercicio1 {

	public static void main(String[] args) {

		int a = -1, b = 0;
		System.out.println(a++ + --b); // resposta certa
		
		System.out.println(a-- + ++b);
//		System.out.println(a-- . --b);

		
	}

}