package entidades;

public class Produto {
	
	private String nome;
	protected double valor;
	
	public Produto() {
		super();
	}
	public Produto(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "Nome do produto: " + nome 
				+ "Preço do produto: R$ " + valor;
	}
	
}
