package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		

		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		System.out.println(a + " + " + b + " = " + soma(a, b));
		System.out.println(a + " - " + b + " = " + subtracao(a, b));
		System.out.println(a + " * " + b + " = " + multiplicacao(a, b));
		System.out.println(a + " / " + b + " = " + divisao(a, b));
	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}

	public static float divisao(int a, int b) {
		float resultado = (float) a / b;
		return resultado;
	}


}
