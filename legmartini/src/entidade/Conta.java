package entidade;

public class Conta {

	private int numConta;
	private String titular;
	private double saldo;
	public double limite = 100;

	public Conta(int numConta, String titular) {
		this.numConta = numConta;
		this.titular = titular;
	}

	public Conta(int numConta, String titular, double depositoInicial) {
		this.numConta = numConta;
		this.titular = titular;
		deposito(depositoInicial);
	}

	public int getNumConta() {
		return numConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double quantia) {
		saldo += quantia;
	}
	public void saque(double quantia) {
		if (quantia + 5 > this.saldo) {
			System.out.println("Não foi possível efetuar essa operação.");
		} else {
			this.saldo -= quantia + 5.0;
		}	
	}
	
	public void emprestimo(double quantia) {
		if (quantia < this.limite) {
			System.out.println("Seu empréstimo foi liberado.");
			this.saldo += quantia;
		} else {
			System.out.println("Seu empréstimo foi negado.");
		}
	}
	
	public String toString() {
		return "Número da Conta: " 
				+ numConta
				+ ", titular: "
				+ titular
				+ ", Saldo: R$ "
				+ String.format("%.2f", saldo);	
	}
}
