package pruebas;

import java.util.Scanner;

//Calcular el área de un círculo
public class PerímetroCircu {

	public static void main(String[] args) {

		double r, a;
		// Lectura de teclado
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio del círculo: ");
		r = sc.nextInt();
		// El área es:
		a = 2 * Math.PI * r;
		System.out.println("El perímetro del círculo es: " + a);

	}

}
