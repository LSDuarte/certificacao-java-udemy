package udemy.javaapi;

/**
 * @author LSDuarte
 *
 */
public class InterfacesFuncionais {

	// s�o funcionais porque possuem um �nico m�todo abstrato
	interface B {void m();} // funcional
	interface D {static void m(){} void m2();} // funcional

	// n�o possuem m�todo abastrato
	interface A {} // n�o funcional
	interface C {default void m() {}} // n�o funcional
	
	public static void main(String[] args) {
		
	}
}