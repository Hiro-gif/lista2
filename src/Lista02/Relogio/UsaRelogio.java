package Lista02.Relogio;

public class UsaRelogio {
	public static void main(String[] args) {

		Relogio horario = new Relogio(22, 15);
		
		horario.passarMinuto();
		horario.imprimir();
		horario.mudarTempo();
		

	}

}
