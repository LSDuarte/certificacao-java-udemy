package udemy.javabasico;

/**
 * @author LSDuarte
 *
 *	Classes devem ter baixo acoplamento com rela��o a outras classes
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

	// estudar, n�o entendi bem, n�o entendi nada.
	
	// metodo construtor
	private Encapsulamento encapsulamento2;

	public Acoplamento(Encapsulamento encapsulamento2) {
		this.encapsulamento2 = encapsulamento2;
	}
	
}