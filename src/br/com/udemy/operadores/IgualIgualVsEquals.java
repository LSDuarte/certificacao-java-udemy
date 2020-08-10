package br.com.udemy.operadores;

/**
 * @author LSDuarte
 *
 *
 *	== compara a referencia e o m�todo EQUALS compara conte�do
 *
 */
public class IgualIgualVsEquals {

	public static void main(String[] args) {
		
		// variaveis a e b v�o para mesmo local na memoria, e a variavel c por estar com new String, ir� para outro lugar, por isso a compa��o de b == c � false.
		
		String a = "Java", b = "Java", c = new String("Java");
		
		boolean d = b == a; // true
		boolean e = b.equals(a); // true
		boolean f = b == c; // false

	}

}