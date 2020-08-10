package br.com.udemy.loops;

/**
 * @author LSDuarte
 *
 */
public class IniciandoLoops {

	public static void main(String[] args) {

		int a;
		//for (;a < 10; a++) {} inválido pois "a" não foi inicializada;
		
		for (;;) {} // válido
		
	  //for (a=10; a=15;a++) {} inválido, deveria ser a == 15
		
/*		for (a =10; a < 10; a ++) {
			if (a > 0) {
				continue;
			} else {
				break;
			}
			System.out.println("1"); // inválido pois esse trecho nunca poderá ser executado
		}
*/
	/*	while (false) { //erro de compilação pois o bloco jamais será executado.
			
		}
	*/
		
/*		boolean b = false;
		while (b) { //valido
			
		}
*/		
	}

}