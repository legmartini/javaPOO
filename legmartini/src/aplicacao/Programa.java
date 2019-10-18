package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);		

		System.out.print("Nome do produto: ");
		String nome = sc.nextLine();

		System.out.print("Valor do produto: R$ ");
		double preco = sc.nextDouble();
		
		Produto produto = new Produto(nome, preco);
		
		produto.setNome("Computador");
		
		System.out.println("Dados do Produto: " + produto);

		System.out.println("");
		System.out.print("Quantos produtos você deseja adicionar ao estoque? ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);

		System.out.println("");
		System.out.println("Dados atualizados: " + produto);

		System.out.println("");
		System.out.print("Quantos produtos você deseja remover do estoque? ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);

		System.out.println("");
		System.out.println("Dados atualizados: " + produto);

		sc.close();

	}
}
