package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.Conhecimento;

public class Funcionario {

	private String nome;
	private Conhecimento nivel;
	private Double salBase;
	
	private Departamento departamento;
	private List<Contrato> contratos = new ArrayList<>();
	
	public Funcionario() {
		
	}
	public Funcionario(String nome, Conhecimento nivel, Double salBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salBase = salBase;
		this.departamento = departamento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Conhecimento getNivel() {
		return nivel;
	}
	public void setNivel(Conhecimento nivel) {
		this.nivel = nivel;
	}
	
	public Double getSalBase() {
		return salBase;
	}
	public void setSalBase(Double salBase) {
		this.salBase = salBase;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public List<Contrato> getContratos() {
		return contratos;
	}
	
	public void addContrato(Contrato contrato) {
		contratos.add(contrato);
	}
	public void delContrato(Contrato contrato) {
		contratos.remove(contrato);
	}
	
	public double salTotal(int ano, int mes) {
		double soma = salBase;
		Calendar cal = Calendar.getInstance();
		for (Contrato c : contratos) {
			
			cal.setTime(c.getData());
			
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			
			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
}
