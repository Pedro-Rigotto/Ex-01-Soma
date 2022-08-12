import java.util.*;

class Soma {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		// Declaracao de variaveis
		int num1, num2, soma;
		
		// Leituras
		System.out.println("Digite um número:");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo número:");
		num2 = sc.nextInt();
		
		// Somar
		soma = num1 + num2;
		
		// Imprimir
		System.out.println("Resultado da soma: " + soma);
	}
}

