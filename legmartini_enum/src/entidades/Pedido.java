package entidades;

import java.util.Date;

import entidades.enums.EncomendaStatus;

public class Pedido {
	
	private Integer id;
	private Date momento;
	private EncomendaStatus status;
	
	public Pedido() {
		
	}
	public Pedido(Integer id, Date momento, EncomendaStatus status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public EncomendaStatus getStatus() {
		return status;
	}
	public void setStatus(EncomendaStatus status) {
		this.status = status;
	}
	
	public String toString() {
		return "Pedido: \n" + 
				"ID: " + id 
				+ "\nData e hora: " 
				+ momento 
				+ "\nStatus do pedido: " 
				+ status 
				+ ".";
	}
}
