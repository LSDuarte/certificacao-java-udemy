package udemy.javaapi;

/**
 * @author LSDuarte
 *
 */
public class InterfacesFuncionais {

	// são funcionais porque possuem um único método abstrato
	interface B {void m();} // funcional
	interface D {static void m(){} void m2();} // funcional

	// não possuem método abastrato
	interface A {} // não funcional
	interface C {default void m() {}} // não funcional
	
	public static void main(String[] args) {
		
	}
}