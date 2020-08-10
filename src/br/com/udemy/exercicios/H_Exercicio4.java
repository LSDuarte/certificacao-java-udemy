package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 4: Que método abaixo sobrescreve corretamente o método print()?
 *
 *	void print(){}
 *	private void print(){}
 *	public final void print() {} (X)
 *	public void print(int i){}
 *	protected int print() {}
 *
 */
public class H_Exercicio4 {

	public static void main(String[] args) {

	/*
		class A {
		    protected void print() {
		        System.out.print("A");
		    }
		}
		 
		class B extends A {
		    //sobrescrita de método aqui
		}   
	*/	
	} // metodo sobrescrito não pode alterar a visibilidade "private", "default"... nem a lista de argumentos, não pode alterar tipo de retorno ou tipos primitivos.

}