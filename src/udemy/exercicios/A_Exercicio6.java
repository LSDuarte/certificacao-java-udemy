package udemy.exercicios;

/**
 * @author LSDuarte
 * 
 * 	Pergunta 6: Qual a saida?
 *
 *	1
 *	2
 *	3 (X) >> VERIFICAR O POR QUE
 *	4
 *	Exception
 */
import java.util.Arrays;

public class A_Exercicio6 {

	public static void main(String[] args) {
		int a[] = { 7, 1, 9, 3, 0, 2 }; // array com elementos fora de ordem.
		
		Arrays.sort(a, 2, 6); // sort reordena do index 2 a 6 ou seja, >>> (7,1, 0,2,3,9)
		
		System.out.print(a[2] + a[4]); // a[2] é 0, e a[4] é 3  >> resultado 3
	}

}