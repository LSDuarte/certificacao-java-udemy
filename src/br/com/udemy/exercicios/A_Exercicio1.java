package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 1: Qual a saida?
 *
 *	1 (X)
 *	2
 *	3
 *	Erro de compila��o
 *	Exception
 *
 *
 */
public class A_Exercicio1 {

	static int a; // v�riavel statica iniciado com 0 por padr�o

	public static void main(String[] args) {

		int b[] = new int[] { 1, 2, 3 }; // array declarado com 1,2 e 3 
		System.out.print(b[a++]); // p�s fixado... mostra primeiro o elemento 0, depois o "a" � incrementado, por isso � igual a 1

	}

}