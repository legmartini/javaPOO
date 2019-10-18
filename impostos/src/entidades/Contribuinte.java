package entidades;

public abstract class Contribuinte {
	
	private String nome;
	private double renda;
	
	public Contribuinte(){
		super();
	}
	public Contribuinte(String nome, double renda) {
		super();
		this.nome = nome;
		this.renda = renda;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getRenda() {
		return renda;
	}
	
	public abstract Double imposto();
}
