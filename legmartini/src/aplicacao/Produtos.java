package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.ProdutosObj;

public class Produtos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos produtos você quer inserir? ");
		int n = sc.nextInt();
		ProdutosObj[] vetor = new ProdutosObj[n];
		
		for (int i=0; i<vetor.length; i++) {
			sc.nextLine();
			
			System.out.print("Nome do Produto: ");
			String nome = sc.nextLine();
			
			System.out.print("Preço do Produto: ");
			double preco = sc.nextDouble();
			
			vetor[i] = new ProdutosObj(nome, preco);
		}
		
		double soma = 0.0;
		
		for (int i=0; i<vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = soma / n;
		
		System.out.printf("Preço médio: R$ %.2f%n", media);
		
		sc.close();
	}
}
