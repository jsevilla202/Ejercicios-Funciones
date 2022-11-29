package ejercicio2;

public class Esfera {
	static double radio;
	
	double Superficie() {
		double superficie = (4*Math.PI)*Math.pow(radio, 2);
		return superficie;
	}

	double Volumen() {
		double volumen = ((4*Math.PI)/3)*Math.pow(radio, 3);
		return volumen;
}
}
