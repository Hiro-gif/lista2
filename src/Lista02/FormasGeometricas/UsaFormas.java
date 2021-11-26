package Lista02.FormasGeometricas;

public class UsaFormas {
	public static void main(String[] args) {

		Circulo circulo = new Circulo();

		circulo.calcArea(5);
		circulo.calcPerimetro(5);

		System.out.println("--------------------------------------------------------------------------------");

		Retangulo retangulo = new Retangulo(5,8);

		retangulo.calcArea();
		retangulo.calcPerimetro();

		System.out.println("---------------------------------------------------------------------------------");

		Retangulo quadrado = new Retangulo(5,5);

		Metodos.calcularFormas(quadrado);
		
	}
}
