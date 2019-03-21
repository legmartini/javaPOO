package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Exchange;

public class Program4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Exchange ex = new Exchange();
		
		System.out.print("Dollar price today: U$ ");
		ex.dolar = sc.nextDouble();
		System.out.print("How many dollars will be bought? U$ ");
		ex.quant = sc.nextDouble();
		System.out.printf("Amount to be paid in Reais: R$ %.2f", ex.total());
		
		
		
		sc.close();
	}

}
