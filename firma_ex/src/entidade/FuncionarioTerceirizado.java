package entidade;

public class FuncionarioTerceirizado extends Funcionario {
		
	private double adicionalTerceirizado;
	
	public FuncionarioTerceirizado() {
		super();
	}
	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, double adicionalTerceirizado) {
		super(nome, horas, valorPorHora);
		this.adicionalTerceirizado = adicionalTerceirizado;
	}
	
	public double getAdicionalTerceirizado() {
		return adicionalTerceirizado;
	}
	public void setAdicionalTerceirizado(double adicionalTerceirizado) {
		this.adicionalTerceirizado = adicionalTerceirizado;
	}
	
	@Override
	public double salario() {
		return super.salario() + adicionalTerceirizado * 1.1;
	}
}
