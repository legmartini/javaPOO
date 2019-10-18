package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Número de Produtos: ");
		int qntProdutos = sc.nextInt();
		
		for (int i=1; i<=qntProdutos; i++) {
			System.out.println("Produto #" + i + ":");
			
			System.out.print("Nacional, Importado ou Usado (N/I/U): ");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			
			if (resp == 'n') {
				System.out.println();
				System.out.println("Produto Nacional");
				
				System.out.print("Nome do produto: ");
				String nome = sc.nextLine();
				
				System.out.print("Valor do produto: ");
				double preco = sc.nextDouble();
				
				list.add(new Produto(nome, preco));
			} 
			
			else if (resp == 'i') {
				System.out.println();
				System.out.println("Produto Importado");
				
				System.out.print("Nome do produto: ");
				String nome = sc.nextLine();
				
				System.out.print("Valor do produto: ");
				double preco = sc.nextDouble();

				System.out.print("Impostos: ");
				double impostos = sc.nextDouble();
				
				list.add(new ProdutoImportado(nome, preco, impostos));
			}
			
			/*else if (resp == 'u') {
				System.out.print("Nome do produto: ");
				String nome = sc.nextLine();
				
				System.out.print("Valor do produto: ");
				double preco = sc.nextDouble();
				
				System.out.print("Data de manufatura: ");
				dataDeFabricacao = sdf.format(dataDeFabricacao);
				
				list.add(new ProdutosUsados(nome, preco, dataDeFabricacao));
			}*/
		}
		
		System.out.println();
		System.out.println("Lista dos Produtos");
		System.out.println();
		
		for (Produto produto : list) {
			System.out.println(produto.getNome() + " | R$ " + String.format("%.2f", produto.getValor()));
		}
		
		sc.close();
	}
}
