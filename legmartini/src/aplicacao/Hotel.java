package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Quartos;

public class Hotel {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos ser�o alugados? ");
		int n = sc.nextInt();
		
		if (n <= 9) {
			Quartos[] vetor = new Quartos[n];
			
			for (int i=0; i<vetor.length; i++) {
				sc.nextLine();
				System.out.println("H�spede n�mero " + (i+1));
				
				System.out.print("Nome do H�spede: ");
				String nome = sc.nextLine();
				
				System.out.print("Email do H�spede: ");
				String email = sc.nextLine();
				
				System.out.print("N�mero do Quarto: ");
				int quarto = sc.nextInt();
				
				vetor[i] = new Quartos(nome, email, quarto);
				
				System.out.println("Quarto ocupados: ");
				
				System.out.println(Quartos.getQuarto() + ":" + Quartos.getNome() + ", " + Quartos.getEmail());
				} 
			} else {
			System.out.println("N�o temos quartos suficientes para toda essa galera.");
			}

		sc.close();
	}
}
