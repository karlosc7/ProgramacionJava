package pruebas;

import java.util.Scanner;

//Cacular una ecuación de segundo grado
public class Ecuacion2Grado {

	public static void main(String[] args) {
		double a, b, c;
		double x1, x2, d;
		@SuppressWarnings("resource")
		//Lectura de teclado
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce a: ");
		a = sc.nextInt();
		System.out.println("Introduce b");
		b = sc.nextInt();
		System.out.println("Introduce c");
		c = sc.nextInt();

		d = ((b * b) - 4 * a * c);
		if (d < 0)
			System.out.println("No soluciones");
		else {
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println(+x1);
			System.out.println(+x2);
		}
	}

}
