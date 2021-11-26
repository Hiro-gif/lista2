package Lista02.Conta;

public class UsaConta {
	public static void main(String[] args) {
		ContaCorrente thiago = new ContaCorrente(25000);

		thiago.sacar(1000);
		thiago.depositar(2);
	}
}
