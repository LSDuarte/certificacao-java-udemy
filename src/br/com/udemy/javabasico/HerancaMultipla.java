/**
 * 
 */
package br.com.udemy.javabasico;

/**
 * @author LSDuarte
 * 
 * Não é permitido herança multipla dentro do java, porém o java permite o mesmo mecanismo por meio das interfaces e seus metodos default.
 *
 */
public interface HerancaMultipla {

	public abstract void comer();
	public default void dormir() {
		System.out.println("Animal Dormindo");
	}
	
}