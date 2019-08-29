package lista2;

import java.util.Scanner;

public class Q7 {

	public static void sts() {

		Scanner in = new Scanner(System.in);
		int neg = 0, posi = 0, zero = 0;
		int n1, n2, n3, n4, n5;

		System.out.print("Insira o primeiro inteiro: ");
		n1 = in.nextInt();
		if (n1 < 0)
			neg++;
		else if (n1 > 0)
			posi++;
		else
			zero++;

		System.out.print("Insira o segundo inteiro: ");
		n2 = in.nextInt();
		if (n2 < 0)
			neg++;
		else if (n2 > 0)
			posi++;
		else
			zero++;

		System.out.print("Insira o terceiro inteiro: ");
		n3 = in.nextInt();
		if (n3 < 0)
			neg++;
		else if (n3 > 0)
			posi++;
		else
			zero++;

		System.out.print("Insira o quarto inteiro: ");
		n4 = in.nextInt();
		if (n4 < 0)
			neg++;
		else if (n4 > 0)
			posi++;
		else
			zero++;

		System.out.print("Insira o quinto inteiro: ");
		n5 = in.nextInt();
		if (n5 < 0)
			neg++;
		else if (n5 > 0)
			posi++;
		else
			zero++;

		System.out.println("\nNegativos: " + neg + "\nPositivos: " + posi + "\nZeros: " + zero);
		
		in.close();

	}

	public static void main(String[] args) {
		
		sts();

	}

}
