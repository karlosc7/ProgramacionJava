package pruebas;

import java.util.Scanner;

public class NumeroIguales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
		int first = sc.nextInt();
		System.out.println("Introduce otro n�mero: ");
		int second = sc.nextInt();

		if (first == second) {
			System.out.println("Los n�meros son iguales");
		} else {
			System.out.println("Los n�meros son distintos");
		}
	}
}