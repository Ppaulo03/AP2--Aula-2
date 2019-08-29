package lista2;

import java.util.Scanner;

public class Q5 {

	static double pi = 3.14;

	public static void circulo(int r) {
		int d = 2 * r;
		double circ, area;

		circ = 2 * pi * r;
		area = pi * r * r;

		System.out.print("\nDiâmetro: " + d + "\nCircuferência: " + circ + "\nAréa: " + area);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r;

		System.out.print("Insira o raio do círculo: ");
		r = in.nextInt();

		circulo(r);

		in.close();

	}

}
