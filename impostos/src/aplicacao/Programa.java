package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contribuinte;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Insira o número de contribuintes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Contribuinte #" + i);
			
			System.out.print("Pessoa Física ou Jurídica (F/J): ");
			char tipo = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome da pessoa: ");
			String nome = sc.nextLine();
			
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			
			if (tipo == 'f') {
				System.out.print("Gastos com saúde: ");
				Double gastosSaude = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, renda, gastosSaude));
			} 
			
			else if (tipo == 'j') {
				System.out.print("Número de funcionários: ");
				Integer qntFuncionarios = sc.nextInt();
				
				list.add(new PessoaJuridica(nome, renda, qntFuncionarios));
			}
		}
		
		Double soma = 0.0;
		for (Contribuinte contribuinte : list) {
			System.out.println(contribuinte.getNome() + ": " + String.format("R$ %.2f", contribuinte.imposto()));
			soma += contribuinte.imposto();
		}
		
		sc.close();
	}
}
