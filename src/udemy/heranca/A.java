package udemy.heranca;

/**
 * @author LSDuarte
 *
 */
public class A {

	public int a = 1;

	public int getA() {
		return a;
	}

	public final String getNome() { // não pode ser sobrescrito
		return "nome";
	}

}