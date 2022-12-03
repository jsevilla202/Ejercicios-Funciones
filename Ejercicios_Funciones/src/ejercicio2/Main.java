package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		int menu;
		
		final Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación el programa calculara la superficie y el volumen de la esfera insertando el radio de esta");
		System.out.print("Inserte el radio en cm, por favor: ");
		Esfera.radio = sc.nextDouble();
		if(Esfera.radio<0) {
			System.out.println("ERROR: El radio no puede ser inferior a 0");
		}
		else {
		System.out.println("¿Qué desea?\n 1. Obtener todos los decimales\n 2. Obtener 4 decimales");
		System.out.print("Inserte aquí su respuesta: ");
		menu =sc.nextInt();
		
		switch(menu) {
		case 1: 
			System.out.println("La superficie es de "+ Esfera.Superficie()+" cm²");
			System.out.println("El volumen es de "+Esfera.Volumen()+" cm³");
			break;
		case 2:
			System.out.println("La superficie es de "+ String.format("%.4f",Esfera.Superficie())+" cm²");
			System.out.println("El volumen es de "+String.format("%.4f",Esfera.Volumen())+" cm³");
			break;
		default:
			System.out.println("ERROR: Valor introducido incorrecto");
			break;
		}
		}
		
		sc.close();

	}

}
