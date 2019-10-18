package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;

public class Cadastro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários você deseja cadastrar? ");
		int numFuncionarios = sc.nextInt();
		
		for (int x = 1; x <= numFuncionarios; x++) {
			
			System.out.println("Funcionário #" + x);
			
			System.out.print("ID do funcionário: ");
			int idFuncionario = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Nome do funcionário: ");
			String nomeFuncionario = sc.nextLine();
			
			System.out.print("Salário do funcionário: ");
			double salFuncionario = sc.nextDouble();
			
			list.add(new Funcionario(idFuncionario, nomeFuncionario, salFuncionario));
		}
		
		System.out.println("");
		System.out.print("Digite o ID do funcionário que receberá o aumento: ");
		int idFuncionario = sc.nextInt();
		
		Funcionario funcionario = 
		list.stream().filter(x -> x.getIdFuncionario() == idFuncionario).findFirst().orElse(null);
		
		if (funcionario == null) {
			System.out.println("Esse funcionário não existe.");
		} else {
			System.out.print("Qual a porcentagem do aumento? ");
			double porcento = sc.nextDouble();
			funcionario.salAumento(porcento);
		}
		
		System.out.println("");
		System.out.println("Lista dos funcionários:");
		for (Funcionario obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
}
