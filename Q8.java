package lista2;

import java.util.Scanner;

public class Q8 {

	public static void soma() {

		Scanner in = new Scanner(System.in);
		int n;
		double soma = 0;

		System.out.print("Insira o valor de N: ");
		n = in.nextInt();

		if (n > 0) {
			for (int cont = 1; cont <= n; cont++)
				soma = (double) soma + (1.0 / cont);
		}

		System.out.println(soma);

		in.close();
	}

	public static void main(String[] args) {

		soma();

	}

}
