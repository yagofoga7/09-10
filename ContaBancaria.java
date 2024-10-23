package implement;

public class ContaBancaria {
	private double saldo;
	public ContaBancaria(double saldoInicial) {
		if (saldoInicial >= 0) {
			this.saldo = saldoInicial;
		}else {
			this.saldo = 0;
		}
	}
	public double getSaldo() {
		return saldo;
	}
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
		}else {
			System.out.println("O valor depositado é inválido.");
		}
	}
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
		}else {
			System.out.println("A tentativa de saque é inválida! Verifique novamente o valor.");
		}
	}
}


