package br.com.udemy.tiposdedados;

/**
 * @author LSDuarte
 *
 */
public class AtribuicoesInvalidas {

	public static void main(String[] args) {

	//	byte a = 128; // invalido pois byte cabe um valor máximo de 127 - erro de compilação
		int i = 10;
	//	short s = i + 128; // invalido. soma retorna inteiro. short é uma tipagem com pontos flutuantes. - não cabe em um short
		
		
		System.out.println("Tipos de dados em Java: \n" +
	            "\nMenor Byte: " + Byte.MIN_VALUE +
	            "\nMaior Byte: " + Byte.MAX_VALUE +
	            "\nMenor Short Int: " + Short.MIN_VALUE +
	            "\nMaior Short Int: " + Short.MAX_VALUE +
	            "\nMenor Int: " + Integer.MIN_VALUE +
	            "\nMaior Int: " + Integer.MAX_VALUE +
	            "\nMenor Long: " + Long.MIN_VALUE +
	            "\nMaior Long:" + Long.MAX_VALUE +
	            "\nMenor Float: " + Float.MIN_VALUE +
	            "\nMaior Float: " + Float.MAX_VALUE +
	            "\nMenor Double: " + Double.MIN_VALUE +
	            "\nMaior Double: " + Double.MAX_VALUE +
	            "\n-------------------------------------------------------");	
	
		  byte tipoByte = 127;
	      short tipoShort = 32767;
	      char tipoChar = 'C';
	      float tipoFloat = 2.6f;
	      double tipoDouble = 3.59;
	      int tipoInt = 2147483647;
	      long tipoLong = 9223372036854775807L;
	      boolean tipoBooleano = true;
	      System.out.println("Valor do tipoByte = " + tipoByte);
	      System.out.println("Valor do tipoShort = " + tipoShort);
	      System.out.println("Valor do tipoChar = " + tipoChar);
	      System.out.println("Valor do tipoFloat = " + tipoFloat);
	      System.out.println("Valor do tipoDouble = " + tipoDouble);
	      System.out.println("Valor do tipoInt = " + tipoInt);
	      System.out.println("Valor do tipoLong = " + tipoLong);
	      System.out.println("Valor do tipoBooleano = " + tipoBooleano);
		
		
		
	}

}