package udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 12: Qual a saida?
 *
 *	0 (X)
 *	1
 *	2
 *	3
 *	Erro de compila��o
 *
 */
public class A_Exercicio12 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 }; // array inteiro iniciado com 1, 2, 3
		a = new int[3]; // novo array iniciado com 0 por padr�o
		System.out.println(a[1]); // result 0
	}

}