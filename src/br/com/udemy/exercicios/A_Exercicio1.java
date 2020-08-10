package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 1: Qual a saida?
 *
 *	1 (X)
 *	2
 *	3
 *	Erro de compilação
 *	Exception
 *
 *
 */
public class A_Exercicio1 {

	static int a; // váriavel statica iniciado com 0 por padrão

	public static void main(String[] args) {

		int b[] = new int[] { 1, 2, 3 }; // array declarado com 1,2 e 3 
		System.out.print(b[a++]); // pós fixado... mostra primeiro o elemento 0, depois o "a" é incrementado, por isso é igual a 1

	}

}