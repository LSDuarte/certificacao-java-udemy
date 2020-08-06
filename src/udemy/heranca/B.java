package udemy.heranca;

/**
 * @author LSDuarte
 *
 */
public class B extends A {

	public int a = 2;

	// retorno precisa ser int ou subtipo
	// nivel de acesso não pode ser mais restritivo
	// lista de argumentos deve ser igual

	public int getNumero() {
		return 2;
	}
	
}