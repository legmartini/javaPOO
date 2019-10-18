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
		
		System.out.print("Quantos funcion�rios voc� deseja cadastrar? ");
		int numFuncionarios = sc.nextInt();
		
		for (int x = 1; x <= numFuncionarios; x++) {
			
			System.out.println("Funcion�rio #" + x);
			
			System.out.print("ID do funcion�rio: ");
			int idFuncionario = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Nome do funcion�rio: ");
			String nomeFuncionario = sc.nextLine();
			
			System.out.print("Sal�rio do funcion�rio: ");
			double salFuncionario = sc.nextDouble();
			
			list.add(new Funcionario(idFuncionario, nomeFuncionario, salFuncionario));
		}
		
		System.out.println("");
		System.out.print("Digite o ID do funcion�rio que receber� o aumento: ");
		int idFuncionario = sc.nextInt();
		
		Funcionario funcionario = 
		list.stream().filter(x -> x.getIdFuncionario() == idFuncionario).findFirst().orElse(null);
		
		if (funcionario == null) {
			System.out.println("Esse funcion�rio n�o existe.");
		} else {
			System.out.print("Qual a porcentagem do aumento? ");
			double porcento = sc.nextDouble();
			funcionario.salAumento(porcento);
		}
		
		System.out.println("");
		System.out.println("Lista dos funcion�rios:");
		for (Funcionario obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
}
