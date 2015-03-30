package pruebas;

import java.util.Scanner;

public class NumeroIguales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int first = sc.nextInt();
		System.out.println("Introduce otro número: ");
		int second = sc.nextInt();

		if (first == second) {
			System.out.println("Los números son iguales");
		} else {
			System.out.println("Los números son distintos");
		}
	}
}