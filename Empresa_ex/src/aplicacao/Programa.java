package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Departamento;
import entidades.Funcionario;
import entidades.enums.Conhecimento;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		System.out.print("Departamento do Funcionário: ");
		String departamento = sc.nextLine();
		
		System.out.println("Insira os dados do funcionário:");
		
		System.out.print("Nome: ");
		String funcionarioNome = sc.nextLine();
		System.out.print("Nível: ");
		String funcionarioNivel = sc.nextLine();
		System.out.print("Salário base: ");
		double funcionarioSal = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(
				funcionarioNome, Conhecimento.valueOf(funcionarioNivel), funcionarioSal, new Departamento(departamento));
		
		System.out.print("Quantos contratos tem esse funcionário? ");
		int n_contratos = sc.nextInt();
		
		for (int i=1; i<=n_contratos; i++) {
			System.out.print("Dados do #"+ i +" contrato: ");
			System.out.print("Data (DD/MM/AAAA): ");
			Date contratoData = sdf.parse(sc.next());
			
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			
			System.out.print("Duração do contrato: ");
			int horas = sc.nextInt();
			
			Contrato contrato = new Contrato(contratoData, valorHora, horas);
			funcionario.addContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Insira o mês e o ano para receber os dados (MM/AAAA): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0,2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
		System.out.println("Salário total em " + mesAno + ": R$ " + String.format("%.2f", funcionario.salTotal(ano, mes)));
		
		sc.close();
	}
}
