package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 11: Qual a saida?
 *
 *	0,null, false (X)
 *	0,0,false
 *	Erro de compila��o
 *	Exception
 *
 */
public class A_Exercicio11 {

	int[] a = new int[1]; // 0 por padr�o
	Object b[] = new Object[1]; // null por padr�o
	boolean c; // iniciado com false por padr�o

	public static void main(String args[]) {
		A_Exercicio11 t = new A_Exercicio11();
		System.out.println(t.a[0] + ", " + t.b[0] + ", " + t.c);
	}

}