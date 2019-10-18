package aplicacao;

import java.util.Scanner;

import entidades.Conta;
import entidades.ContaCNPJ;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados da sua conta");
		
		System.out.print("Nome: ");
		String titular = sc.nextLine();
		
		System.out.print("Conta: ");
		int numConta = sc.nextInt();
		
		System.out.print("Saldo: ");
		double saldo = sc.nextDouble();
		
		Conta conta = new Conta(numConta, titular, saldo);
		
		System.out.println(conta);
		
		System.out.println("Dados da sua conta CNPJ");
		sc.nextLine();
		
		System.out.print("Nome: ");
		String titularCnpj = sc.nextLine();
		
		System.out.print("Conta: ");
		int numContaCnpj = sc.nextInt();
		
		System.out.print("Saldo: ");
		double saldoCnpj = sc.nextDouble();
		
		System.out.print("Limite da conta: ");
		double limite = sc.nextDouble();
		
		ContaCNPJ contacnpj = new ContaCNPJ(numContaCnpj, titularCnpj, saldoCnpj, limite);
		
		System.out.println(contacnpj);
		
		System.out.println("Dados da sua conta poupança");
		sc.nextLine();
		
		System.out.print("Nome: ");
		String titularPoupa = sc.nextLine();
		
		System.out.print("Conta: ");
		int numContaPoupa = sc.nextInt();
		
		System.out.print("Saldo: ");
		double saldoPoupa = sc.nextDouble();
		
		System.out.print("Taxa de juros: ");
		double taxaJuros = sc.nextDouble();
		
		ContaPoupanca contapoupa = new ContaPoupanca(numContaPoupa, titularPoupa, saldoPoupa, taxaJuros);
		
		System.out.println(contapoupa);
	}
}
