package entidades;

public class Conta {
	
	protected Integer numConta;
	protected String titular;
	protected Double saldo;
	
	public Conta() {
	}
	public Conta(Integer numConta, String titular, Double saldo) {
		this.numConta = numConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumConta() {
		return numConta;
	}
	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void saque(double quantia) {
		this.saldo += quantia + 2.0;
	}
	public void deposito(double quantia) {
		this.saldo -= quantia;
	}
	
	public String toString() {
		return "Conta corrente: " + numConta + "\n"
				+ "Nome do cliente: " + titular + "\n"
				+ "Saldo: R$ " + saldo;
	}
}
