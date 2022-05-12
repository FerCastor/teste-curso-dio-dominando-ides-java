package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
		
		
		/*double a = 2.4;
		double b = 1.69;
			
		System.out.println("A soma de a + b é: " + (a+b));*/
	}
}

class Livro {
	private String livro;
	private String num_pag;
}
