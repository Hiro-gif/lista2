package Lista02.Conta;

public class ContaCorrente {

	private double saldo;

	public ContaCorrente(float saldo) {
		this.saldo = saldo;
	}

	public ContaCorrente() {
		saldo = 0;
	}

	public void sacar(double saque) {
		if (saldo >= saque) {
			printarOperacao(1, saque);
			saldo -= saque;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

	public void depositar(float deposito) {
		printarOperacao(2, deposito);
		saldo += deposito;

	}

	public void printarOperacao(int operacao, double valorOperacao) {
		double novoSaldo = 0;

		if (operacao == 1) {
			novoSaldo = getSaldo() - valorOperacao;
			System.out.println("Operação: " + getSaldo() + "-" + valorOperacao + " = " + novoSaldo);
		} else {
			novoSaldo = getSaldo() + valorOperacao;
			System.out.println("Operação: " + getSaldo() + "+" + valorOperacao + " = " + novoSaldo);
		}

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double valor) {
		saldo = valor;
	}
}
