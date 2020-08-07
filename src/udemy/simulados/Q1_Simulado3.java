package udemy.simulados;

/**
 * @author LSDuarte
 *
 *	Pergunta 3: Qual a saída? 
 *
 *	Erro de compilação
 *	0
 *	000 (x)
 *	00
 *	Exception
 *
 */
public class Q1_Simulado3 {

	public static void main(String[] args) {
		int[] a = new int[0b11]; /// tamanho 3, passado em binario.
		for (int i : a) // por padrão iniciado com 0
			System.out.print(i); // imprime 3 zeros.
	}

}