package udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 3: Qual a saída?
 *
 *	1
 *	2
 *	9
 *	7
 *	8 (X) >> Verificar o por que
 *	Erro de compilação
 */
public class A_Exercicio3 {

	public static void main(String[] args) {
								//0							//1					  //2
		int a[][][] = { { { 1, 2 }, { 3, 4 } }, { { 4, 5, 6 }, { 7, 8 } }, { { 9 }, { 10 } } };
													 //0          //1
		System.out.print(a[1][1][1]); // 3 dimensões, está tentando acessar, o [1] elemento, do [1] elemento, do [1] elemento
	}

}