package Lista02.Relogio;


import java.util.Scanner;

public class Relogio {

	private int hora;
	private int minuto;

	public Relogio(int hora, int min) {
		this.hora = hora;
		this.minuto = min;

	}
	
	public void passarHora() {
		for (int i = 0; i <= 24; i++) {
			System.out.println("Hora atual: " + i);
		}
	}

	public void passarMinuto() {
		minuto += 1;
		if (minuto >= 60) {
			hora += 1;
			minuto = 0;
			if (hora >= 24) {
				hora = 0;
			}

		}

	}

	public void imprimir() {
		System.out.println(hora + ":" + minuto);

	}

	public void mudarTempo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o valor: ");
		String input = scan.nextLine();
		setHora(Integer.parseInt(input.split(":")[0])) ;
		setMinuto(Integer.parseInt(input.split(":")[1]));
	}
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {

		if (hora <= 24) {
			this.hora = hora;
			System.out.println("Nova hora: " + hora);
		} else {
			System.out.println("Hora inválida");
		}
	}

	public int getMinuto() {
		return minuto;

	}

	public void setMinuto(int minuto) {
		if (minuto <= 59) {
			this.minuto = minuto;
			System.out.println("Novo minuto: " + minuto);
		} else {
			System.out.println("Minuto inválido");
		}
	}
}
