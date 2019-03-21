package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle measures below.");
		System.out.print("Height: ");
		rect.height = sc.nextDouble();
		System.out.print("Width: ");
		rect.width = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n", rect.area());
		System.out.printf("PERIMETER: %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL: %.2f%n", rect.diagonal());
		
		System.out.println("END");
		
		sc.close();
	}

}
