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
			System.out.println("exception "); //ser� executado
		} finally {
			System.out.println("finaly "); //ser� executado
		}
		
		
	//	try {
			
			Object a = null;
			System.out.println(a.toString());
			
//		} catch (NullPointerException | RuntimeException e) { // inv�lido - n�o compila - s�o subclasses.
//			System.out.println(e.getMessage());
		
//		}
			
			
/*		try {
			Object b = null;
			System.out.println(b.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException n) {
			System.out.println(n.getMessage()); // inv�lido
		}	
*/			
			
	}

}