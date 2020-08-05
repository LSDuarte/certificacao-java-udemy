package udemy.exercicios;

/**
 * @author LSDuarte
 * 
 * 	Pergunta 2: Qual a saida?
 * 
 * 	1
 * 	2
 * 	3
 * 	Erro de compilação
 * 	Exception (X)
 *
 */
public class A_Exercicio2 {

	public static void main(String[] args) {
		int a = 2;
		char b[] = new char[a]; // Tamanho 2, declarado na variavel "a"
		b[0] = 1; // armazena 
		b[1] = 2; // armazena
		b[2] = 3; // não armazena porque o array b é com apenas 2, ou seja, 0 e 1
		System.out.print(b[2]); 
	}

}