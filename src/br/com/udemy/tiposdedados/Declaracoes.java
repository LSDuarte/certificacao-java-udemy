package br.com.udemy.tiposdedados;

/**
 * @author LSDuarte
 *
 */
public class Declaracoes {

	public static void main(String[] args) {

		Boolean a = true; // v�lido - true
		Boolean b = new Boolean("True"); // v�lido - true
		Boolean c = new Boolean("TRUe"); // v�lido - true
		Boolean d = new Boolean("T"); // inv�lido - false
		
		int e = 012; //octal equivale a 10 em decial
		int f = 0x2A; //hexadecimal que equivale a 42
		
	//	float g = 0.15; //invalido pois 0.15 � um double
		float h = 0.15F; //v�lido
		
		double i = 0.15D; //0.15d tamb�m � valido
		
		long j = 1521; //valido
		
		double l = 0.15f; //valido
		
	//	byte = 500; //invalido porque byte s� comporta at� 127
		byte n = 127; // valido
		
	}

}