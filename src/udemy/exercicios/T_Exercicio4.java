package udemy.exercicios;

/**
 * @author LSDuarte
 * 
 * 	Pergunta 4: Qual a saída desse código? 
 *
 *	NullPointerException (X)
 *	Erro de compilacao
 *	0
 *	1
 *	Nenhuma das anteriores
 *
 */
public class T_Exercicio4 {
	
	static Double a;
    static double b;

	public static void main(String[] args) {

		 System.out.println(a*b); // Variavel do tipo wrapper, não tem inicialização.
	}

}