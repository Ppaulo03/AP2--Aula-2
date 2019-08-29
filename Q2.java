package lista2;

import java.util.Scanner;

public class Q2 {

	public static int soma(int a, int b, int c) {
		int soma;
		soma = a + b + c;
		return soma;
	}

	public static double media(int a, int b, int c) {
		double media;
		media = (double) (soma(a, b, c)) / 3;
		return media;
	}

	public static int menor(int a, int b, int c) {
		int menor;
		menor = a;

		if (b < menor)
			menor = b;
		
		if (c < menor)
			menor = c;

		return menor;
	}
	
	public static int maior(int a, int b, int c) {
		int maior;
		maior = a;

		if (b > maior)
			maior = b;
		
		if (c > maior)
			maior = c;

		return maior;
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2, n3;

		System.out.print("Insira o primeiro inteiro: ");
		n1 = in.nextInt();
		System.out.print("Insira o segundo inteiro: ");
		n2 = in.nextInt();
		System.out.print("Insira o terceiro inteiro: ");
		n3 = in.nextInt();
		
		System.out.println("\nSoma: " + soma(n1,n2,n3) + "\nMédia: " + media(n1,n2,n3) + "\nMenor: " + menor(n1,n2,n3) + "\nMaior: "
				+ maior(n1,n2,n3));

		in.close();

	}

}
