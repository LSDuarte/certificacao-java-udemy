package udemy.heranca;

/**
 * @author LSDuarte
 *
 */
public interface Interface {

	void metodo(); // public e abstract
	
	public default void metodo2() {};
	
//	public default String toString() {}; // invalido sobrescrever metodo da classe Object

// classe Object é mãe de todas as classes do Java	
	
}