package entidades;

public class PessoaFisica extends Contribuinte {
	
	private double gastosSaude;
	
	public PessoaFisica() {
		super();
	}
	public PessoaFisica(String nome, double renda, double gastosSaude) {
		super(nome, renda);
		this.gastosSaude = gastosSaude;
	}
	
	public double getGastosSaude() {
		return gastosSaude;
	}
	
	@Override
	public Double imposto() {
		if (super.getRenda() <= 20000) {
			return (super.getRenda() * 0.15) - (gastosSaude * 0.50);
		} else {
			return (super.getRenda() * 0.25) - (gastosSaude * 0.50);
		}
	}
}
