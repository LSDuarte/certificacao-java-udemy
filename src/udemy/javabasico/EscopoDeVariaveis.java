package udemy.javabasico;

/**
 * @author LSDuarte
 * Inicio aos estudos para certifica��o java 27/07/2020
 */
public class EscopoDeVariaveis {

	private static int a = 1;
	
	public static void main(String[] args) {
		int a = 2;
		System.out.println("O valor �: " + a); 
		
		// ir� sobreposto pela variavel do metodo main, desconsiderando variavel da classe.

		// String[] args = {"aaaaa"}; //erro de compila��o pois possui o mesmo nome de v�riavel no mesmo escopo, da conflito.
	
	}

}