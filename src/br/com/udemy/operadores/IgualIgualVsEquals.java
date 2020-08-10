package br.com.udemy.operadores;

/**
 * @author LSDuarte
 *
 *
 *	== compara a referencia e o método EQUALS compara conteúdo
 *
 */
public class IgualIgualVsEquals {

	public static void main(String[] args) {
		
		// variaveis a e b vão para mesmo local na memoria, e a variavel c por estar com new String, irá para outro lugar, por isso a compação de b == c é false.
		
		String a = "Java", b = "Java", c = new String("Java");
		
		boolean d = b == a; // true
		boolean e = b.equals(a); // true
		boolean f = b == c; // false

	}

}