package udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 4: Qual a saida?
 *
 *	0
 *	1
 *	Erro de compilação
 *	NullPointerException (X)
 *	ArrayIndexOutOfBoundsException
 *
 */
public class A_Exercicio4 {

	public static void main(String[] args) {
		int array[][] = new int[2][]; // duas dimensões, apenas a 1 dimensão é inserida tamanho 2;
		array[0][0] = 1; 
		System.out.print(array[0][0]);
	}

}