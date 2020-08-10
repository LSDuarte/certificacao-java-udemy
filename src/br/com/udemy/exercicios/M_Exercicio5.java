package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 5: QUal a saida?
 *	
 *	0
 *	1
 *	null
 *	erro de compilação (x)
 *	exception
 *
 */
public class M_Exercicio5 {

	public static void main(String[] args) {

		/*
			package um;
			 
			class A {
			    protected int a;
			    public void zerar() {
			        a = 0;
			    }
			}
			 
			//código em outro arquivo
			 
			package dois;
			 
			import um.*;
			 
			public class B extends A {
			    int b = a;
			    public static void main(String[] args) {
			        A a = new A();
			        a.zerar();
			        System.out.print(a.a);              
			    }  
			}		
		*/		
		// erro de compilação, variavel "a" é protected, e a classe B está tentando acessar a variavel em outro pacote, se fosse no mesmo pacote não ocorreria.
	}

}