/**
 * 
 */
package udemy.javabasico;

/**
 * @author LSDuarte
 *
 *         Com o encapsulamento voc� pode barrar acesso indevido a estrutura
 *         interna da classe. Os detalhes internos s�o escondidos.
 *
 */
public class Encapsulamento {

	private int radius;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
}