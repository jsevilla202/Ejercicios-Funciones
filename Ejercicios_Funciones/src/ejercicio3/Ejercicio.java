package ejercicio3;

import java.util.Scanner;

public class Ejercicio {

	public static void main(final String[] args) {
		int menu;
		
		final Scanner sc = new Scanner(System.in);
		final NumerosAleatorios numeros = new NumerosAleatorios();
		
		System.out.println("¿Qué acción desea realizar?\n 1. Recibir n números aleatorios\n 2. Recibir n números aleatorios con un valor máximo\n 3. Recibir n números aleatorios con un máximo y un mínimo");
		System.out.print("Inserte aquí su respuesta: ");
		menu =sc.nextInt();
		
		if(menu>=1&&menu<=3) {
			if(menu==1) {
				System.out.print("Inserte la cantidad de números a generar: ");
				NumerosAleatorios.cantidad = sc.nextInt();
				numeros.numerosAleatorios(NumerosAleatorios.cantidad);
			}
			else if(menu==2) {
				System.out.print("Inserte la cantidad de números a generar: ");
				NumerosAleatorios.cantidad = sc.nextInt();
				System.out.print("Inserte el valor máximo de los números aleatorios: ");
				NumerosAleatorios.valormaximo = sc.nextInt();
				numeros.numerosAleatorios(NumerosAleatorios.cantidad, NumerosAleatorios.valormaximo);
			}
			else {
				System.out.print("Inserte la cantidad de números a generar: ");
				NumerosAleatorios.cantidad = sc.nextInt();
				System.out.print("Inserte el valor máximo de los números aleatorios: ");
				NumerosAleatorios.valormaximo = sc.nextInt();
				NumerosAleatorios.valormaximo++;
				System.out.print("Inserte el valor mínimo de los números aleatorios: ");
				NumerosAleatorios.valorminimo = sc.nextInt();
				numeros.numerosAleatorios(NumerosAleatorios.cantidad, NumerosAleatorios.valormaximo, NumerosAleatorios.valorminimo);
			}
		}
		else {
			System.out.println("ERROR: Valor introducido incorrecto");
		}
		sc.close();

	}

}
