package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class VetorAltura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos dados serão inseridos? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print(i+1 + "ª medida: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		
		double media = soma / n;
		
		System.out.printf("Média dos dados inseridos: %.2f%n", media);
		
		sc.close();
	}
}
