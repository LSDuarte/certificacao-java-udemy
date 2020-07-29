package udemy.tiposdedados;

/**
 * @author LSDuarte
 *  
 *  Remove objetos da memoria quando eles n�o s�o mais referenciados pelo programa.
 */
public class GarbageCollection {

	public static void main(String[] args) {
		
		Object a = new Object();
		a = null;  // objeto elegivel ao Garbage Collection porque n�o se referencia mais no escopo, recebendo null;
		
		Object b = new Object();
		Object c = b;
		
		b = null; // objeto original N�O elegivel ao Garbage Collection porque ele est� referenciado dentro da variavel C.
		
	}

}