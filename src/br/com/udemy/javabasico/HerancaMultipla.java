/**
 * 
 */
package br.com.udemy.javabasico;

/**
 * @author LSDuarte
 * 
 * N�o � permitido heran�a multipla dentro do java, por�m o java permite o mesmo mecanismo por meio das interfaces e seus metodos default.
 *
 */
public interface HerancaMultipla {

	public abstract void comer();
	public default void dormir() {
		System.out.println("Animal Dormindo");
	}
	
}