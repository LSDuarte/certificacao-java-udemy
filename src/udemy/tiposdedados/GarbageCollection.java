package udemy.tiposdedados;

/**
 * @author LSDuarte
 *  
 *  Remove objetos da memoria quando eles não são mais referenciados pelo programa.
 */
public class GarbageCollection {

	public static void main(String[] args) {
		
		Object a = new Object();
		a = null;  // objeto elegivel ao Garbage Collection porque não se referencia mais no escopo, recebendo null;
		
		Object b = new Object();
		Object c = b;
		
		b = null; // objeto original NÃO elegivel ao Garbage Collection porque ele está referenciado dentro da variavel C.
		
	}

}