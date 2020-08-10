package br.com.udemy.simulados;

/**
 * @author LSDuarte
 *
 *	Pergunta 1:
 * 	char[] a = {'1', '2', '3', '4'}; 
 *
 *	Que opção pode acessar o elemento  4?
 *
 */
public class Q1_Simulado1 {

	public static void main(String[] args) {
		char[] a = {'1', '2', '3', '4','5'};
		System.out.println(a.length);
		System.out.println(a[a.length-1]);
		
		System.out.println(a[a.length-2]);
	}

}