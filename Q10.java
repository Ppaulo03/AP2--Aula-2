package lista2;

import java.util.Scanner;

public class Q10 {

	public static void serie(int n) {

		int serie, soma = 0, mut = 1;
		System.out.print("\nSérie : ");
		if (n == 0) {
			mut = 1;
			System.out.print("0");
		}
		for (int cont = 1; cont <= n; cont++) {
			serie = cont * cont;
			System.out.print(serie);
			
			if (cont < n)
				System.out.print(", ");
			
			if (serie % 2 == 0)
				soma = soma + serie;
			else
				mut = mut * serie;
		}
		System.out.println("\nSoma dos números pares: " + soma + "\nMutiplicação dps números ímpares: " + mut);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;

		System.out.print("Insira o N - ésimo termo: ");
		n = in.nextInt();

		serie(n);

		in.close();

	}

}
