package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stud = new Student();
		
		System.out.print("Nome: ");
		stud.name = sc.nextLine();
		System.out.print("Nota 1: ");
		stud.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		stud.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		stud.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", stud.media());
		
		if (stud.media() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f", stud.missed());
			System.out.println(" POINTS");
			
		sc.close();
		}
		
	}	

}
