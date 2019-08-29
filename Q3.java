package lista2;

import java.util.Scanner;

public class Q3 {

	public static void par(int n) {
		boolean par;

		if (n % 2 == 0)
			par = true;

		else
			par = false;

		System.out.println(n + " é " + (par == true ? "par" : "ímpar "));

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;

		System.out.print("Insira o primeiro inteiro: ");
		n = in.nextInt();

		par(n);

		in.close();

	}

}
