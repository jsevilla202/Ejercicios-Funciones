package ejercicio1;

public class Numeros {
	
	boolean esPrimo(int numero) {
		boolean primo = true;
		
		for(int i = 2, k = 2; i!=numero;i++) {
			//Si el resto del número introducido entre el contador es 0, se le suma 1 a la variable "k"
			if(numero%i==0) {
				k++;
				//Si la variable "k" llega a 3, ya no es primo por lo que nombramos la variable "primo" falsa y salimos del bucle con break
				if(k>=3) {
					primo = false;
					break;
				}
			}
	}
		if(primo==false){
			return false;
		}
		else {
			return true;
		}
	}
	
	boolean esCapicua(int numero) {
		int auxiliar = numero;
		int inverso = 0;
		while(auxiliar!=0) {
			int cifra = auxiliar%10;
			inverso = inverso*10+cifra;
			auxiliar = auxiliar/10;
		}
		if(inverso==numero) {
			return true;
		}
		else {
			return false;
		}
	}

}
