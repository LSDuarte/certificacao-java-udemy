package udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 4: Qual a saída?
 *
 *	true true true true true false (X)
 *	true true true true true true
 *	true true true false true false
 *	true true true false false false
 *
 */
public class O_Exercicio4 {

	public static void main(String[] args) {

		String nome1 = "Pedro";
		String nome2 = nome1;
		String nome3 = "Pedro";
		String nome4 = new String("Pedro");

		System.out.print(nome1.equals(nome2) + " "); // true
		System.out.print(nome1 == nome2);  // true

		System.out.print(" " + nome1.equals(nome3) + " "); // true
		System.out.print(nome1 == nome3); // true

		System.out.print(" " + nome1.equals(nome4) + " "); // true
		System.out.print(nome1 == nome4); // false

	}

}