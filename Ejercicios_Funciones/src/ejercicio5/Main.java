package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int menu;
		
		final Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Qué acción desea realizar?\n 1. Sumatorio\n 2. Potencia\n 3. Serie Fibonacci");
		System.out.print("Inserte aquí su respuesta: ");
		menu =sc.nextInt();
		
		switch(menu) {
			case 1:
				System.out.println("La función de este apartado es realizar el sumatorio de un número hasta 0. Ej. Si inserta 5, obtendrá 5+4+3+2+1+0=15"
						+ "\nEl número no puede ser inferior a 1");
				System.out.print("Inserte un número, por favor: ");
				FuncionesRecursivas.numero = sc.nextInt();
				if(FuncionesRecursivas.numero>=1) {
				System.out.println("El resultado de su operación es: "+FuncionesRecursivas.sumatorio(FuncionesRecursivas.numero));
				}
				else {
					System.out.println("ERROR: Número introducido no válido");
				}
				break;
			case 2:
				System.out.println("La función de este apartado es elevar cualquier número al expnente que desee");
				System.out.print("Inserte el número base, por favor: ");
				FuncionesRecursivas.a = sc.nextDouble();
				System.out.print("Inserte el número exponente, por favor: ");
				FuncionesRecursivas.n = sc.nextInt();
				System.out.println("El resultado de su operación es: "+FuncionesRecursivas.potencia(FuncionesRecursivas.a, FuncionesRecursivas.n));
				break;
			case 3:
				System.out.println("La función de este apartado es mostrar el termino crrespondiente en la serie de Fibonacci");
				System.out.print("Inserte un número, por favor: ");
				FuncionesRecursivas.numero = sc.nextInt();
				System.out.println(FuncionesRecursivas.serieFibonacci(FuncionesRecursivas.numero));
				break;
			default:
				System.out.println("ERROR: Valor introducido incorrecto");
				break;
		}
		sc.close();

	}

}
