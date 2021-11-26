package Lista02.FormasGeometricas;

public class Retangulo {
	private int largura;
	private int altura;

	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void calcArea(){
		float area = this.altura * this.largura;
		System.out.println("Area = "+ area + "cm^2");

	}

	public void calcPerimetro(){
		float perimetro = (this.altura * 2)  + (this.largura * 2);
		System.out.println("Perimetro = "+ perimetro + "cm");

	}


}