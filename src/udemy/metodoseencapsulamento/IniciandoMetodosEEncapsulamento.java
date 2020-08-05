package udemy.metodoseencapsulamento;

/**
 * @author LSDuarte
 *
 */
public class IniciandoMetodosEEncapsulamento {

	int a = 1;
	static int b = 1;
	
	public static void main(String[] args) {

//		System.out.println(a); // inválido pois a não é estático
		System.out.println(b); 
		
		m();
//		m2(); // invalido pois m2() não é estatico
		
		IniciandoMetodosEEncapsulamento main = new IniciandoMetodosEEncapsulamento();
		main.m2();
		
	}

	private static void m() {}
	private void m2() {}
}