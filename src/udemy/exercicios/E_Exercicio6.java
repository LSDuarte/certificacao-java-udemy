package udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 6: Qual a saida?
 *
 *	Exception
 *	Finaly
 *	Exception Finaly
 *	0
 *	Finaly seguida por ArithmeticException (x)
 * 
 *	(Finally Exception in thread "main" java.lang.ArithmeticException: / by zero
	at udemy.exercicios.E_Exercicio6.main(E_Exercicio6.java:19) )
 *
 */
public class E_Exercicio6 {

	public static void main(String[] args) {
		try {
			System.out.println(2 % 0);
		} catch (NullPointerException e) {
			System.out.print("Exception ");
		} finally {
			System.out.print("Finally ");
		}
	}

}