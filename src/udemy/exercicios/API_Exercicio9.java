package udemy.exercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LSDuarte
 * 
 * Pergunta 9: Qual a saida?
 * 
 * ABC
 * AB
 * AC
 * ACB
 * Exception (X)
 */
public class API_Exercicio9 {

	public static void main(String[] args) {
		List a = new ArrayList();
		a.add("A");
		a.add(2, "B");
		a.add(1, "C");
		System.out.println(a);
	}

}