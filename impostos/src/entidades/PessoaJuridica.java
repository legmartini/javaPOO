package entidades;

public class PessoaJuridica extends Contribuinte{
	
	private int qntFuncionarios;
	
	public PessoaJuridica(){
		super();
	}
	public PessoaJuridica(String nome, double renda, int qntFuncionarios) {
		super(nome, renda);
		this.qntFuncionarios = qntFuncionarios;
	}
	
	public Integer getQntFuncionarios() {
		return qntFuncionarios;
	}
	public void setQntFuncionarios(Integer qntFuncionarios) {
		this.qntFuncionarios = qntFuncionarios;
	}
	
	@Override
	public Double imposto() {
		if (getQntFuncionarios() <= 10) {
			return (super.getRenda() * 0.16);
		} else {
			return (super.getRenda() * 0.14);
		}
	}
}
