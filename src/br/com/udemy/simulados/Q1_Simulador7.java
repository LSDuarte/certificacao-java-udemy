package br.com.udemy.simulados;

/**
 * @author LSDuarte
 *
 *	Pergunta 7: Qual a saida?
 *	
 *	10
 *	10.0 (x)
 *	Erro de compila��o
 *	Exception
 *	10.00
 */
public class Q1_Simulador7 {

	public static void main(String[] args) {
		Object a = new Float(10); //ponto fluante
		Number b = (Number) a; // faz um cast convertendo um object em number, � permitido, Float � subclasses de number
		System.out.println(b);
	}

}