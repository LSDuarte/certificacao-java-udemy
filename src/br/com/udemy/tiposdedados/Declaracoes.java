package br.com.udemy.tiposdedados;

/**
 * @author LSDuarte
 *
 */
public class Declaracoes {

	public static void main(String[] args) {

		Boolean a = true; // válido - true
		Boolean b = new Boolean("True"); // válido - true
		Boolean c = new Boolean("TRUe"); // válido - true
		Boolean d = new Boolean("T"); // inválido - false
		
		int e = 012; //octal equivale a 10 em decial
		int f = 0x2A; //hexadecimal que equivale a 42
		
	//	float g = 0.15; //invalido pois 0.15 é um double
		float h = 0.15F; //válido
		
		double i = 0.15D; //0.15d também é valido
		
		long j = 1521; //valido
		
		double l = 0.15f; //valido
		
	//	byte = 500; //invalido porque byte só comporta até 127
		byte n = 127; // valido
		
	}

}