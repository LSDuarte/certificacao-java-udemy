package udemy.simulados;

/**
 * @author LSDuarte
 *
 *	Pergunta 3: Qual a sa�da? 
 *
 *	Erro de compila��o
 *	0
 *	000 (x)
 *	00
 *	Exception
 *
 */
public class Q1_Simulado3 {

	public static void main(String[] args) {
		int[] a = new int[0b11]; /// tamanho 3, passado em binario.
		for (int i : a) // por padr�o iniciado com 0
			System.out.print(i); // imprime 3 zeros.
	}

}