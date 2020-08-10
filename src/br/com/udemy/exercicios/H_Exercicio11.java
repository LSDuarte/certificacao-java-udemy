package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 11: Qual a saida?
 *	
 *	1 2
 *	1 1 
 *	2 1
 *	2 2 
 *	Erro de compilação (X)
 *
 */
public class H_Exercicio11 {

	public static void main(String[] args) {

		/*
		class A{
			   public int getNumero(){ return 1;}
			}
			 
			class B extends A{
			    public long getNumero(){ return 2;}
			}
			 
			public class Main{
			   public static void main(String[] args){
			       B b = new B();
			       A ab = new B();
			       System.out.print(b.getNumero() + " " + ab.getNumero());
			   }
			}
		*/
		// metodos sobrescritos devem ter o mesmo tipo de retorno ( Long não é compativel com Int)
	}

}