package udemy.simulados;

import java.io.IOException;

/**
 * @author LSDuarte
 *
 *	Pergunta 5: O que deve ser posto na linha 12 para que o código compile?
 *
 *	throws IOException, ClassNotFoundException (x)
 *	throws IOException ClassNotFoundException
 *  throws IOException & ClassNotFoundException
 *  throws
 *  Nenhuma das anteriores
 *
 */
public class Q1_Simulador5 {

	static void m1() throws IOException {
		throw new java.io.IOException();
	}

	static void m2() throws ClassNotFoundException {
		throw new SecurityException();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		m1();
		m2();
	}

}