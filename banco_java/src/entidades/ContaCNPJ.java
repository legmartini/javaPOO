package entidades;

public class ContaCNPJ extends Conta{
	
	protected double limite;
	
	public ContaCNPJ() {
		super();
	}
	public ContaCNPJ(Integer numConta, String titular, Double saldo, double limite) {
		super(numConta, titular, saldo);
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void emprestimo(double quantia) {
		if (quantia <= limite) {
			limite -= quantia;
			saldo += quantia - 10.0;
		}
	}
	
	public String toString() {
		return "Conta corrente: " + numConta + "\n"
				+ "Nome do cliente: " + titular + "\n"
				+ "Saldo: R$ " + saldo + "\n"
				+ "Limite: R$ " + limite;
	}
}

