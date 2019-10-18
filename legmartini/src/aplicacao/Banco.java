package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("N�mero da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Nome do t�tular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.println("Voc� gostaria de fazer um dep�sito inicial? s/n ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.println("Qual o valor do dep�sito inicial? R$ ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numConta, titular, depositoInicial);
		} else {
			conta = new Conta(numConta, titular);
		}
		
		
		System.out.println("");
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println("");
		System.out.print("Valor do dep�sito: R$ ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("Dados atualizados p�s dep�sito: ");
		System.out.println(conta);
		
		System.out.println("");
		System.out.print("Valor do saque: R$ ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Dados atualizados p�s saque: ");
		System.out.println(conta);
		
		System.out.println("");
		System.out.print("Valor do empr�stimo: R$ ");
		double emprestimo = sc.nextDouble();
		conta.emprestimo(emprestimo);
		System.out.println("Dados atualizados p�s empr�stimo: ");
		System.out.println(conta);
		
		sc.close();
	}
}
