package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;
import entidade.FuncionarioTerceirizado;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários você deseja cadastrar? ");
		int qntFuncionarios = sc.nextInt();
		
		for (int c=1; c<=qntFuncionarios; c++) {
			System.out.println("Funcionário #" + c + ": ");
			
			System.out.print("Este funcionário é teceirizado (s/n)? ");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Horas Trabalhadas: ");
			int horas = sc.nextInt();
			
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			
			if (resp == 's') {
				System.out.print("Pagamento adicional: ");
				double adicionalTerceirizado = sc.nextDouble();
				list.add(new FuncionarioTerceirizado(nome, horas, valorPorHora, adicionalTerceirizado));
			} else {
				list.add(new Funcionario(nome, horas, valorPorHora));
			}
		}
		
		System.out.println();
		System.out.println("Lista de pagamentos:");
		
		for (Funcionario func : list) {
			System.out.println(func.getNome() + " R$ " + String.format("%.2f", func.salario()));
		}
		
		sc.close();
	}
}
