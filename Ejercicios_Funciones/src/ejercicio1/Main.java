package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		int numero;
		int menu;
		
		final Scanner sc = new Scanner(System.in);
		final Numeros funciones = new Numeros();
		
		System.out.println("Este programa comprueba si el número introducido es primo y/o capicua");
		
		System.out.println("¿Qué acción desea realizar?\n 1. Comprobar Primo\n 2. Comprobar Capicua\n 3. Ambas");
		System.out.print("Inserte aquí su respuesta: ");
		menu =sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.print("Inserte un número, por favor: ");
			numero = sc.nextInt();
			if(numero>0) {
			System.out.println(funciones.esPrimo(numero)?"Tu número es Primo":"Tu número no es Primo");
			}
			else {
				System.out.println("ERROR: No existen los números primos inferiores a 1");
			}
			break;
		case 2:
			System.out.print("Inserte un número, por favor: ");
			numero = sc.nextInt();
			System.out.println(funciones.esCapicua(numero)?"Tu número es Capicua":"Tu número no es Capicua");
			break;
		case 3:
			System.out.print("Inserte un número para comprobar si es primo, por favor: ");
			numero = sc.nextInt();
			System.out.println(funciones.esPrimo(numero)?"Tu número es Primo":"Tu número no es Primo");
			System.out.print("Inserte un número para comprobar si es capicua, por favor: ");
			numero = sc.nextInt();
			System.out.println(funciones.esCapicua(numero)?"Tu número es Capicua":"Tu número no es Capicua");
			break;
		default:
			System.out.println("ERROR: Valor introducido incorrecto");
			break;
		}
		
		sc.close();
		
		
		

	}

}
