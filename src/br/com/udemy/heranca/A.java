package br.com.udemy.heranca;

/**
 * @author LSDuarte
 *
 */
public class A {

	public int a = 1;

	public int getA() {
		return a;
	}

	public final String getNome() { // n�o pode ser sobrescrito
		return "nome";
	}

	protected void print() {
		System.out.println("A");
	}
}