package pruebas;

import java.util.Scanner;

//Calcular el �rea de un c�rculo
public class RadioCirculo {

	public static void main(String[] args) {

		double r, a;
		// Lectura de teclado
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio del c�rculo: ");
		r = sc.nextInt();
		// El �rea es:
		a = Math.PI * (r * r);
		System.out.println("El �rea del c�rculo es: " + a);

	}

}
