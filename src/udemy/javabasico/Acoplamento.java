package udemy.javabasico;

/**
 * @author LSDuarte
 *
 *	Classes devem ter baixo acoplamento com relação a outras classes
 *
 */
public class Acoplamento {

	private Encapsulamento encapsulamento = new Encapsulamento();
		
	public void setEncapsulamento(Encapsulamento encapsulamento) {
		this.encapsulamento = encapsulamento;
	}
	
	public Encapsulamento getEncapsulamento() {
		return encapsulamento;
	}

	// estudar, não entendi bem, não entendi nada.
	
	// metodo construtor
	private Encapsulamento encapsulamento2;

	public Acoplamento(Encapsulamento encapsulamento2) {
		this.encapsulamento2 = encapsulamento2;
	}
	
}