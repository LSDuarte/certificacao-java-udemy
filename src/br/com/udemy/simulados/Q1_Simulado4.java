package br.com.udemy.simulados;

import java.util.Arrays;

/**
 * @author LSDuarte
 * 
 * 	Pergunta 4: Qual a saida?
 * 
 * 	ABCDEF
 * 	Erro de compila��o
 * 	ArrayIndexOutOfBoundsException
 * 	ClassCastException  (x)
 * 	ABCDE
 *
 */
public class Q1_Simulado4 {

	public static void main(String[] args) {
		String[][] a = { { "C", "A" }, { "E", "D", "B" }, { "F" } };
		Arrays.sort(a);
		for (String[] b : a) {
			for (String s : b) {
				System.out.print(s); // n�o suporta um array de mais dimens�es
			}
		}

	}
}