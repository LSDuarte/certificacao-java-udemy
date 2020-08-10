package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 8: Qual deve ser o tipo de retorno do método?
 *
 *
 *	long
 *	int
 *	byte
 *	double (X)
 *	nenhuma das anteriores
 *
 */
public class M_Exercicio8 {
	
	public double metodo(int a) {
		double b = 100.0;
		return (long) a / b * 3;
	}
}