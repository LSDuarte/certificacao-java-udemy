package br.com.udemy.exercicios;

/**
 * @author LSDuarte
 *
 *	Pergunta 7: Qual a saida?
 *
 *	0
 *	10
 *	01 (x)
 *	Exception
 *	Erro de compilação
 *
 *
 */
public class M_Exercicio7 {
	private int a; //0

	public void metodo(int a) {
		a = a; // não faz nada
	}

	public void metodo2(int a) {
		this.a = a; // atribui na variavel do metodo, o da classe.
	}

	public static void main(String[] args) {
		M_Exercicio7 main = new M_Exercicio7();
		main.metodo(1);
		System.out.print(main.a); //0
		main.metodo2(1);
		System.out.print(main.a); //1
	}

}