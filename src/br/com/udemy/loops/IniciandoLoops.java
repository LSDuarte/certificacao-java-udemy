package br.com.udemy.loops;

/**
 * @author LSDuarte
 *
 */
public class IniciandoLoops {

	public static void main(String[] args) {

		int a;
		//for (;a < 10; a++) {} inv�lido pois "a" n�o foi inicializada;
		
		for (;;) {} // v�lido
		
	  //for (a=10; a=15;a++) {} inv�lido, deveria ser a == 15
		
/*		for (a =10; a < 10; a ++) {
			if (a > 0) {
				continue;
			} else {
				break;
			}
			System.out.println("1"); // inv�lido pois esse trecho nunca poder� ser executado
		}
*/
	/*	while (false) { //erro de compila��o pois o bloco jamais ser� executado.
			
		}
	*/
		
/*		boolean b = false;
		while (b) { //valido
			
		}
*/		
	}

}