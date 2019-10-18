package aplicacao;

import java.util.Date;

import entidades.Pedido;
import entidades.enums.EncomendaStatus;

public class Programa {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(1080, new Date(), EncomendaStatus.PAGAMENTO_PENDENTE);
		
		System.out.println(pedido);
		
		EncomendaStatus es1 = EncomendaStatus.ENTREGUE;
		
		EncomendaStatus es2 = EncomendaStatus.valueOf("ENTREGUE");
		
		System.out.println(es1);
		System.out.println(es2);
	}

}
