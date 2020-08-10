package br.com.udemy.exercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LSDuarte
 *
 *	Pergunta 1: Qual a saida?
 *
 *	" "
 *	Erro de compilação
 *	12
 *	123
 *	1 2 3 (X)
 *
 */
public class L_Exercicio1 {

	public static void main(String[] args) {

		List<String> a = new ArrayList<>();
		a.add("1");
		a.add("2");
		a.add("3");
		while (!a.isEmpty()) {
			System.out.print(a.remove(0) + " "); /// ele remove os elementos 1, 2 ,3 e imprime na tela. (PEGADINHA)
		}

	}

}