package br.com.udemy.exercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LSDuarte
 *
 *	Pergunta 2: Qual a saida?
 *	
 *	[4,3] (x)
 *	[3]
 *	[2,4]
 *	Erro de compilação
 *	Exception
 */
public class API_Exercicio2 {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(2, 4);
		a.removeIf(i -> i <= 2);
		System.out.println(a);
	}

}