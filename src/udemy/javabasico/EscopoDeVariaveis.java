package udemy.javabasico;

/**
 * @author LSDuarte
 * Inicio aos estudos para certificação java 27/07/2020
 */
public class EscopoDeVariaveis {

	private static int a = 1;
	
	public static void main(String[] args) {
		int a = 2;
		System.out.println("O valor é: " + a); 
		
		// irá sobreposto pela variavel do metodo main, desconsiderando variavel da classe.

		// String[] args = {"aaaaa"}; //erro de compilação pois possui o mesmo nome de váriavel no mesmo escopo, da conflito.
	
	}

}