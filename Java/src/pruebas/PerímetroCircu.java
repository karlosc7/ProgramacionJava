package pruebas;

import java.util.Scanner;

//Calcular el �rea de un c�rculo
public class Per�metroCircu {

	public static void main(String[] args) {

		double r, a;
		// Lectura de teclado
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio del c�rculo: ");
		r = sc.nextInt();
		// El �rea es:
		a = 2 * Math.PI * r;
		System.out.println("El per�metro del c�rculo es: " + a);

	}

}
