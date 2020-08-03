package udemy.arrays;

/**
 * @author LSDuarte
 *
 */
import java.util.Arrays;

public class IniciandoArrays {

	public static void main(String[] args) {

		
		int a[] = {2,1,4,3};
		int b[][] = {{1,2,3}, {1,2,3,4}};
		
		int[] c = {1,2,3};
		int[] d = new int [4]; // cada elemento é iniciado com 0 por padrão.
		
		d[0] = 3;
		d[3] = 4;
	//  d[4] = 5; ArrayIndexOutOfBoundsException
		
		Arrays.sort(a,1,4); // vai ordenar o array do elemento de index 1 até o 3 (inclusive)
		
		System.out.println(a.length); //4
		System.out.println(b.length); //2
		System.out.println(b[0].length); //3
		System.out.println(b[1].length); //4
		
	}

}