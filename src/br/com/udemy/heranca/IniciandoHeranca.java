package br.com.udemy.heranca;

/**
 * @author LSDuarte
 *
 */
public class IniciandoHeranca {

	public static void main(String[] args) {

		A ab = new B();
		System.out.println(ab.getNome()); // 2
		System.out.println(ab.a); // 1

		System.out.println(ab instanceof B); // true instancia tanto de A quanto de B
		System.out.println(ab instanceof A); // true

	}

}