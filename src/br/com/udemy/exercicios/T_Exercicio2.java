/**
 * 
 */
package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *	
 *	Pergunta 2: Qual a saída?
 *
 *	6 (X)
 *	Exeception
 *	Erro de compilação
 *	0
 *	Erro
 *
 *
 */
public class T_Exercicio2 {

	public static void main(String[] args) {
		
		Integer a1 = new Integer("1"); // CONSTRUTIR, todas válidas
        Integer a2 = Integer.valueOf("2");
        Integer a3 = Integer.decode("3") ;
        System.out.print(a1 + a2 + a3);

	}

}