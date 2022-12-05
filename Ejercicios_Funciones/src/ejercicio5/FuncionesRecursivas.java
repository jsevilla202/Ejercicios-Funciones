package ejercicio5;

public class FuncionesRecursivas {
	
	static int numero;
	static int n;
	static double a;
	static int resultado1 = 0;
	static int resultado2 = 1;
	static int aux;
	
	static int sumatorio(int numero) {
		int resultado=numero;
		if(numero==0) {
			resultado = 0;
		}
		else {
			resultado = resultado+sumatorio(numero-1);
		}
		return resultado;
	}
	
	static double potencia(double a, int n) {
		double resultado = a;
		if(n==0) {
			resultado = 1;
		}
		else if(a==0) {
			resultado = 0;
		}
		else {
			resultado = resultado*potencia(a, n-1);
		}
		return resultado;
	}
	
	/*
	 * ALTERNATIVA
	 * 
	 * 	static int serieFibonacci(int numero) {
		int resultado;
		if(numero<=1) {
			resultado = 1;
		}
		else {
			resultado = serieFibonacci(numero-1)+serieFibonacci(numero-2);
		}
		return resultado;
	}
	 */
	static int serieFibonacci(int numero) {
		if(numero<=1) {
			aux = resultado1;
			resultado1 = resultado2;
			resultado2 = aux+resultado2;
			numero = serieFibonacci(numero-1);
		}
		else {
			aux = resultado2;
		}
		return aux;
	}

}
