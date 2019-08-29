package lista2;

public class Q9 {

	public static void soma() {
		double soma = 0;

		for (int cont = 1; cont <= 10; cont++)
			soma = (double) soma + (cont / (cont * 2.0));

		System.out.println(soma);

	}

	public static void main(String[] args) {

		soma();

	}

}
