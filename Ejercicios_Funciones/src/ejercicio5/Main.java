package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int menu;
		
		final Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Qué acción desea realizar?\n 1. Sumatorio\n 2. Potencia\n 3. Serie Fibonacci");
		System.out.print("Inserte aquí su respuesta: ");
		menu =sc.nextInt();
		
		if(menu>=1&&menu<=3) {
			if(menu==1) {
				System.out.print("Inserte un número, por favor: ");
				FuncionesRecursivas.numero = sc.nextInt();
				if(FuncionesRecursivas.numero>=1) {
				System.out.println("El resultado de su operación es: "+FuncionesRecursivas.sumatorio(FuncionesRecursivas.numero));
				}
				else {
					System.out.println("ERROR: Número introducido no válido");
				}
			}
			else if(menu==2) {
				System.out.print("Inserte el número base, por favor: ");
				FuncionesRecursivas.a = sc.nextDouble();
				System.out.print("Inserte el número exponente, por favor: ");
				FuncionesRecursivas.n = sc.nextInt();
				System.out.println("El resultado de su operación es: "+FuncionesRecursivas.potencia(FuncionesRecursivas.a, FuncionesRecursivas.n));
			}
			else{
				System.out.print("Inserte un número, por favor: ");
				FuncionesRecursivas.numero = sc.nextInt();
				System.out.println(FuncionesRecursivas.serieFibonacci(FuncionesRecursivas.numero));
			}
		}
		else {
			System.out.println("ERROR: Valor introducido incorrecto");
		}
		sc.close();

	}

}
