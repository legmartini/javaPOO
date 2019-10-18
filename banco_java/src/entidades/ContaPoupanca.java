package entidades;

public class ContaPoupanca extends Conta {
	
	protected Double taxaJuros;
	
	public ContaPoupanca() {
		super();
	}
	public ContaPoupanca(Integer numConta, String titular, Double saldo, Double taxaJuros) {
		super(numConta, titular, saldo);
		this.taxaJuros = taxaJuros;
	}
	
	public Double getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizaSaldo() {
		saldo += saldo * taxaJuros;
	}
	
	@Override
	public void saque(double quantia) {
		saldo -= quantia - 5.0;
	}
	
	public String toString() {
		return "Conta corrente: " + numConta + "\n"
				+ "Nome do cliente: " + titular + "\n"
				+ "Saldo: R$ " + saldo + "\n"
				+ "Taxa de juros: R$ " + taxaJuros;
	}
}
