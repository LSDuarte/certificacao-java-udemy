package udemy.exercicios;

/**
 * @author LSDuarte
 *	
 *	Pergunta 9: Qual a saida?
 *
 *	3 2 2 (X) ENTENDER O POR QUE!!!
 *	2 2 2
 *	3 3 3 
 *	2 3 3
 *	Erro de compilação
 *
 */
public class A_Exercicio9 {

	public static void main(String[] args) {
		int a = 3;
		int b[][][] = new int[a][a = 2][a]; // array com 3 dimensões, 1 com tamanho 3, 2 com tamanho 2 pois 1 foi atribuido a "a", e o 3 é 2 pois repete o valor do 2 dimensão
		System.out.println(b.length + " " + b[0].length + " " + b[0][0].length);
	}

}