package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		int menu;
		
		final Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Qué acción desea realizar?\n 1. Recibir n números aleatorios\n 2. Recibir n números aleatorios con un valor máximo\n 3. Recibir n números aleatorios con un máximo y un mínimo");
		System.out.print("Inserte aquí su respuesta: ");
		menu =sc.nextInt();
		
		switch(menu) {
			case 1:
				System.out.print("Inserte la cantidad de números a generar: ");
				NumerosAleatorios.cantidad = sc.nextInt();
				NumerosAleatorios.numerosAleatorios(NumerosAleatorios.cantidad);
				break;
			case 2:
				System.out.print("Inserte la cantidad de números a generar: ");
				NumerosAleatorios.cantidad = sc.nextInt();
				System.out.print("Inserte el valor máximo de los números aleatorios: ");
				NumerosAleatorios.valormaximo = sc.nextInt();
				NumerosAleatorios.numerosAleatorios(NumerosAleatorios.cantidad, NumerosAleatorios.valormaximo);
				break;
			case 3:
				System.out.print("Inserte la cantidad de números a generar: ");
				NumerosAleatorios.cantidad = sc.nextInt();
				System.out.print("Inserte el valor máximo de los números aleatorios: ");
				NumerosAleatorios.valormaximo = sc.nextInt();
				NumerosAleatorios.valormaximo++;
				System.out.print("Inserte el valor mínimo de los números aleatorios: ");
				NumerosAleatorios.valorminimo = sc.nextInt();
				NumerosAleatorios.numerosAleatorios(NumerosAleatorios.cantidad, NumerosAleatorios.valormaximo, NumerosAleatorios.valorminimo);
				break;
			default:
				System.out.println("ERROR: Valor introducido incorrecto");
				break;
		}
		sc.close();

	}

}
