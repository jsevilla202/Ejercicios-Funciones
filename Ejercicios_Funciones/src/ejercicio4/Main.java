package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		int menu;
		
		final Scanner sc = new Scanner(System.in);
		final Operaciones opera = new Operaciones();
		
		System.out.println("¿Qué acción desea realizar?\n 1. Sumar\n 2. Restar\n 3. Multiplicar\n 4. Dividir");
		System.out.print("Inserte aquí su respuesta: ");
		menu =sc.nextInt();
		
		System.out.print("Inserte el primer número, por favor: ");
		opera.n1 = sc.nextInt();
		System.out.print("Inserte el segundo número, por favor: ");
		opera.n2 = sc.nextInt();
		
		if(menu>=1&&menu<=4) {
			if(menu==1) {
				System.out.println("El resultado de su operación es: "+opera.suma());
			}
			else if(menu==2) {
				System.out.println("El resultado de su operación es: "+opera.resta());
			}
			else if(menu==3) {
				System.out.println("El resultado de su operación es: "+opera.multi());
			}
			else {
				System.out.println("El resultado de su operación es: "+String.format("%.2f",opera.divi()));
			}
		}
		else {
			System.out.println("ERROR: Valor introducido incorrecto");
		}
		sc.close();
	}

}
