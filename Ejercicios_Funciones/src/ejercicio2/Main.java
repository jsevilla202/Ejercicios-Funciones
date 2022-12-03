package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte el radio de la esfera y se le devolverá la superficie y el volumen: ");
		Esfera.radio = sc.nextDouble();
		
		System.out.println(Esfera.Superficie());
		System.out.println(Esfera.Volumen());
		
		sc.close();

	}

}
