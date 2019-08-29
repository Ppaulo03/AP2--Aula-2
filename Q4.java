package lista2;

import java.util.Scanner;

public class Q4 {

	public static boolean mutiplo(int n1, int n2) {

		if (n1 % n2 == 0)
			return true;

		else
			return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2;

		System.out.print("Insira o primeiro inteiro: ");
		n1 = in.nextInt();
		System.out.print("Insira o segundo inteiro: ");
		n2 = in.nextInt();

		System.out.println(n1 + (mutiplo(n1, n2) == true ? " é " : " não é ") + "mútiplo de " + n2);

		in.close();

	}

}
