package udemy.operadores;

/**
 * @author LSDuarte
 *
 */
public class IfSemChaves {

	public static void main(String[] args) {

		int a = 1;
		if (a == 0)   // s� possui esta linha, a condi��o � falsa, ent�o o resultado � 2, porque a++
			a = 10;
		a++;
		System.out.println(a); // 2
	}

}