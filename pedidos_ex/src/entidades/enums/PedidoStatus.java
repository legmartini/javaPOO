package entidades.enums;

public enum PedidoStatus {
	
	PAGAMENTO_PENDENTE("Pagamento Pendente"),
	PROCESSANDO("Processamento"),
	ENVIADO("Enviado"),
	ENTREGUE("Entregue");
	
	private final String status;
	
	PedidoStatus(String status){
        this.status = status;
    }
 
    public String getStatus() {
        return status;
    }	
}
