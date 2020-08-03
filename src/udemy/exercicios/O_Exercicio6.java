package udemy.exercicios;

/**
 * @author LSDuarte
 * 
 * 	Pergunta 6: Qual a saida?
 * 
 * 	123
 * 	124	
 * 	1234
 * 	12
 * 	Erro de compilação
 *
 */
public class O_Exercicio6 {

	public static void main(String[] args) {

		String a = "12";
		String b = "";
		if (b.length() != 0)
			b += "3";
		b += "4";
		a += b;
		System.out.println(a);

	}

}