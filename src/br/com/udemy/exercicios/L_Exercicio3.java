package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 3: Qual a saída?
 *	
 *	Erro de compilação
 *	Exception
 *	10 11 12 13 14
 *	10 11 12 13 14 6 7 8 9 
 *	O programa vai entrar em loop infinito (x)
 *
 */
public class L_Exercicio3 {

	public static void main(String[] args) {

		for (int a = 10; a > 6; a++) {
			if (a == 15)
				a -= 9;
			System.out.print(a + " "); // LOOP INFINITO POIS O A VAI VALER 6 quando passar pelo "a -= 9", retornando todo o processo.
		}

	}

}