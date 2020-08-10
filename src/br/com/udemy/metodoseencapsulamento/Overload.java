package br.com.udemy.metodoseencapsulamento;

/**
 * @author LSDuarte
 *
 */
public class Overload {

	private int i;
	private String s;

	public Overload(int i) {
		this.i = i;
	}

	public Overload(String s) {
		this.s = s;
	}

	public void metodo(int i) {}
	public void metodo(String s) {}
	public String metodo(Object o) {return "Hello";}
	
	public static void main(String[] args) {}

}