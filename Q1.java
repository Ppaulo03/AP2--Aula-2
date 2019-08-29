package lista2;

import java.util.Scanner;

public class Q1 {

	public static void comp(int a, int b) {

		System.out.println();

		if (a > b)
			System.out.println(a + " is larger!");

		else if (b > a)
			System.out.println(b + " is larger!");

		else
			System.out.println("This numbers are equals!");

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2;

		System.out.print("Insira o primeiro inteiro: ");
		n1 = in.nextInt();
		System.out.print("Insira o segundo inteiro: ");
		n2 = in.nextInt();

		comp(n1, n2);

		in.close ();
	}

}
