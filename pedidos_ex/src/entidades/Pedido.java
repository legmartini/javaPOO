package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.PedidoStatus;

public class Pedido {
	
	private Date momento;
	private PedidoStatus status;
	private Cliente cliente;
	
	private final List<PedidoItem> itens = new ArrayList<>();
	private final static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Pedido() {
		
	}
	public Pedido(Date momento, PedidoStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	
	public PedidoStatus getStatus() {
		return status;
	}
	public void setStatus(PedidoStatus status) {
		this.status = status;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
    public List getPedidoItem() {
        return itens;
    }
	
	public void addItem(PedidoItem item){
        itens.add(item);
    }
    public void delItem(PedidoItem item){
        itens.remove(item);
    }
    
    public Double valorTotal() {
    	double valorTotal = 0;
    	
    	for (PedidoItem item : itens) {
    		valorTotal += item.subTotal();
    	}
    	return valorTotal;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("\n Dados do pedido: \n");
    	sb.append("Data do pedido: ").append(sdf.format(getMomento())).append("\n");
    	sb.append("Status do pedido: ").append(status.getStatus()).append("/n");
    	sb.append(cliente).append("\n");
    	
    	for (PedidoItem item : itens) {
    		sb.append(item).append("\n");
    	}
    	sb.append("Valor total: R$").append(valorTotal());    	
    	
    	return sb.toString();
    }
}
