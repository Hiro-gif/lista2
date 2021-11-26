package Lista02.FormasGeometricas;

public class Circulo {
	public void calcArea(float raio) {
		double area = Math.PI * (Math.pow(raio,2));
		System.out.println("Area do circulo = "+ area + "cm^2");
	}
	
	public void calcPerimetro(float raio) {
		double perimetro = 2 * raio * Math.PI;
		System.out.println("Perimetro do circulo = " + perimetro + "cm");
	}
	
}
