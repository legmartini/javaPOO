package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Número da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Nome do títular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.println("Você gostaria de fazer um depósito inicial? s/n ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.println("Qual o valor do depósito inicial? R$ ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numConta, titular, depositoInicial);
		} else {
			conta = new Conta(numConta, titular);
		}
		
		
		System.out.println("");
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println("");
		System.out.print("Valor do depósito: R$ ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("Dados atualizados pós depósito: ");
		System.out.println(conta);
		
		System.out.println("");
		System.out.print("Valor do saque: R$ ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Dados atualizados pós saque: ");
		System.out.println(conta);
		
		System.out.println("");
		System.out.print("Valor do empréstimo: R$ ");
		double emprestimo = sc.nextDouble();
		conta.emprestimo(emprestimo);
		System.out.println("Dados atualizados pós empréstimo: ");
		System.out.println(conta);
		
		sc.close();
	}
}
