package Lista02.FormasGeometricas;

public class Metodos {
	public static void calcularFormas(Retangulo objeto) {
		float calcArea = objeto.getAltura()* objeto.getLargura();
		float calcPerimetro = (objeto.getAltura()*2) + (objeto.getLargura() * 2);
		System.out.println("Area do Quadrado = "+ calcArea +"cm^2");
		System.out.println("Perimetro do Quadrado = "+ calcPerimetro +"cm");
	}
}
