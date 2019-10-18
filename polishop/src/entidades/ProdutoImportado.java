package entidades;

public class ProdutoImportado extends Produto{
	
	private double impostos;
	
	public ProdutoImportado() {
		super();
	}
	public ProdutoImportado(String nome, double valor, double impostos) {
		super(nome, valor);
		this.impostos = impostos;
	}
	
	public double getImpostos() {
		return impostos;
	}
	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}
	
	@Override
	public double getValor() {
		return valor + impostos;
	}
	
	public String toString() {
		return "Nome do produto: " + super.getNome() 
				+ "Preço do produto: " + super.getValor();
	}
}
