package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		int numero;
		
		final Scanner sc = new Scanner(System.in);
		final Numeros funciones = new Numeros();
		
		System.out.print("Inserte un número y el programa le dirá si es primo y capicúa: ");
		numero = sc.nextInt();
		
		System.out.println(funciones.esCapicua(numero)?"Tu número es Capicua":"Tu número no es Capicua");
		System.out.println(funciones.esPrimo(numero)?"Tu número es Primo":"Tu número no es Primo");
		
		sc.close();
		
		
		

	}

}
