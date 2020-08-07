package udemy.simulados;

/**
 * @author LSDuarte
 *
 *	Pergunta 2: Qual a saída?
 *
 *	true false (x)
 *	true true
 *	false false
 *	false true
 *	Erro de compilação
 *
 */
public class Q1_Simulado2 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3 }; // 1 dimensão
		int b[][] = { { 1, 2, 2, 3 }, { 2, 2, 1 } }; // 2 dimensões
		
		System.out.print(a[2] == b[0][3]); // true - terceiro elemento do array "a" é igual ao quarto elemento do array "b" 3 = 3
		System.out.print(" " + (a[2] == b[1][1])); // false 3 <> 2

	}

}