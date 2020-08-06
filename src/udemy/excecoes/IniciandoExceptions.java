package udemy.excecoes;

/**
 * @author LSDuarte
 *
 */
public class IniciandoExceptions {

	public static void main(String[] args) {
		
		try {
		
			int a = 1/0;
			
		} catch (Exception e) {
			System.out.println("exception "); //será executado
		} finally {
			System.out.println("finaly "); //será executado
		}
		
		
	//	try {
			
			Object a = null;
			System.out.println(a.toString());
			
//		} catch (NullPointerException | RuntimeException e) { // inválido - não compila - são subclasses.
//			System.out.println(e.getMessage());
		
//		}
			
			
/*		try {
			Object b = null;
			System.out.println(b.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException n) {
			System.out.println(n.getMessage()); // inválido
		}	
*/			
			
	}

}