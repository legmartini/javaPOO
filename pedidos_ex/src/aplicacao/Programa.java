package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Pedido;
import entidades.PedidoItem;
import entidades.Produto;
import entidades.enums.PedidoStatus;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String clienteNome, clienteEmail, statusPedido, produtoNome;
		int produtoQuantidade, itemTotal;
		double produtoPreco;
		Date dataNasc;
		
		System.out.println("Insira os dados do cliente");
		System.out.print("Nome: ");
		clienteNome = sc.nextLine();
		System.out.print("Email: ");
		clienteEmail = sc.nextLine();
		System.out.print("Data de nascimento (dd/mm/aaaa): ");
		dataNasc = sdf.parse(sc.nextLine());
		
		Cliente cliente = new Cliente(clienteNome, clienteEmail, dataNasc);
		
		System.out.println("\nInsira os dados do pedido");
		System.out.print("Status: ");
		statusPedido = sc.nextLine();
		
		Pedido pedido = new Pedido(new Date(), PedidoStatus.valueOf(statusPedido), cliente);
		
        System.out.print("\nQuantos itens compõe esse pedido?  ");
        itemTotal = sc.nextInt();
        
        for(int i = 1; i <= itemTotal; i++){
            System.out.printf("\nEnter #%d item data:%n", i);
            System.out.print("Product name: ");
            sc.nextLine();
            produtoNome = sc.nextLine();
            System.out.print("Product price: ");
            produtoPreco = sc.nextDouble();
            System.out.print("Quantity: ");
            produtoQuantidade = sc.nextInt();
            
            PedidoItem item = new PedidoItem(produtoQuantidade, produtoPreco, new Produto(produtoNome, produtoPreco));
            pedido.addItem(item);
        }
        
        System.out.println(pedido);
	}
}
