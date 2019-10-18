package entidade;

public class Funcionario {
	
	private Integer idFuncionario;
	private String nomeFuncionario;
	private Double salFuncionario;
	
	public Funcionario() {
		
	}
	public Funcionario(Integer idFuncionario, String nomeFuncionario, Double salFuncionario) {
		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.salFuncionario = salFuncionario;
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public Double getSalFuncionario() {
		return salFuncionario;
	}
	public void setSalFuncionario(Double salFuncionario) {
		this.salFuncionario = salFuncionario;
	}
	
	public void salAumento(double porcento) {
		salFuncionario += salFuncionario * porcento / 100.0;
	}
	
	public String toString() {
		return 	  "ID: " + idFuncionario 
				+ " | Nome: " + nomeFuncionario
				+ " | R$ " +String.format("%.2f", salFuncionario);
	}
	
}
