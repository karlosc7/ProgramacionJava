package pruebas;

import java.util.Scanner;

//Calcular el área de un círculo
public class RadioCirculo {

	public static void main(String[] args) {

		double r, a;
		// Lectura de teclado
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio del círculo: ");
		r = sc.nextInt();
		// El área es:
		a = Math.PI * (r * r);
		System.out.println("El área del círculo es: " + a);

	}

}
