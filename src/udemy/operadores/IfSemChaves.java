package udemy.operadores;

/**
 * @author LSDuarte
 *
 */
public class IfSemChaves {

	public static void main(String[] args) {

		int a = 1;
		if (a == 0)   // só possui esta linha, a condição é falsa, então o resultado é 2, porque a++
			a = 10;
		a++;
		System.out.println(a); // 2
	}

}