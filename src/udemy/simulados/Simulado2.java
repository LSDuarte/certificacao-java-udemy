package udemy.simulados;

/**
 * @author LSDuarte
 *
 *	Pergunta 2: Qual a sa�da?
 *
 *	true false (x)
 *	true true
 *	false false
 *	false true
 *	Erro de compila��o
 *
 */
public class Simulado2 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };
		int b[][] = { { 1, 2, 2, 3 }, { 2, 2, 1 } };
		System.out.print(a[2] == b[0][3]); // true
		System.out.print(" " + (a[2] == b[1][1])); // 

	}

}