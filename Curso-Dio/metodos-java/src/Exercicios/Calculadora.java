package Exercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a opera��o desejada (+, -, *, /, %) - ");
		String opcaoOperador = teclado.next();
		System.out.print("N�mero 1 - ");
		double numero1 = teclado.nextDouble();
		System.out.print("N�mero 2 - ");
		double numero2 = teclado.nextDouble();
		
		switch (opcaoOperador) {
		case "+":
			
			System.out.println(numero1 + numero2);
			break;
		case "-":
			System.out.println(numero1 - numero2);
			break;
		case "*":
			System.out.println(numero1 * numero2);
			break;
		case "/":
			System.out.println(numero1 / numero2);
			break;
		case "%":
			System.out.println(numero1 % numero2);
			break;

		default:
			System.out.println("ERRO: Op��o inv�lida");
			break;
		}
		teclado.close();
		
		
		
		
	}

}
