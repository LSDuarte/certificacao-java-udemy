package udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 2: Qual a saida?
 *
 *	Erro de compila��o (x)
 *	A
 *	""
 *	Exception
 *	Nenhuma das anteriores
 *
 */
public class H_Exercicio2 {

	public static void main(String[] args) {

	/*	
		public class Main {
		    public static void main(String[] args) {   
		        A a = new A() { };   
		        System.out.println(a.toString());
		    }
		 } 
		        
		 interface A {
		    public default String toString() {
		        return "A";
		    }             
		 }
	*/
		// Interface est� subscrevendo um metodo toString pois � uma classe object, o que n�o � permitido. - Erro de compila��o
	}

}