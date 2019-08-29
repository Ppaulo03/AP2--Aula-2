package lista2;

public class Q6 {

	public static void pot() {
		int quad, cub;

		System.out.println("Número\t\tQuadrado\tCubo");
		for (int cont = 0; cont <= 10; cont++) {

			quad = cont * cont;
			cub = quad * cont;

			System.out.println(cont + "\t\t" + quad + "\t\t" + cub);

		}
	}

	public static void main(String[] args) {

		pot();

	}

}
