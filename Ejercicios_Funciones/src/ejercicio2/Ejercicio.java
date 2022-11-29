package ejercicio2;

import java.util.Scanner;

public class Ejercicio {

	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		final Esfera esfera = new Esfera();
		
		System.out.print("Inserte el radio de la esfera y se le devolverá la superficie y el volumen: ");
		Esfera.radio = sc.nextDouble();
		
		System.out.println(esfera.Superficie());
		System.out.println(esfera.Volumen());
		
		sc.close();

	}

}
