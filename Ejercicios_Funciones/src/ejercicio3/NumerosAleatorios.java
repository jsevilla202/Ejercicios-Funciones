package ejercicio3;

public class NumerosAleatorios {
	
	static int cantidad, valorminimo, valormaximo;
	static void numerosAleatorios (int cantidad2) {
		for(int i = 1; i<=cantidad;i++) {
			int numero = (int) (Math.random()*100);
			System.out.println(numero);
		}
	}
	
	static void numerosAleatorios (int cantidad, int valormaximo) {
		for(int i = 1; i<=cantidad;i++) {
			int numero = (int) (Math.random()*(valormaximo+1));
			System.out.println(numero);
		}
	}
	
	static void numerosAleatorios (int cantidad, int valorminimo, int valormaximo) {
		for(int i = 1; i<=cantidad;i++) {
			int numero = (int) (Math.random()*(valormaximo-valorminimo)+valorminimo);
			System.out.println(numero);
		}
}
}
