package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Increase;

public class Program7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Increase> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int emp = sc.nextInt();
		
		for (int i=1; i<=emp; i++) {
			System.out.println();
			System.out.println("Employee #" + i);
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: U$ ");
			double salary = sc.nextDouble();
			list.add(new Increase(id, name, salary));
		}
		
		System.out.println("ID of salary increase: ");
		int id = sc.nextInt();
		Increase emp1 = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp1 == null) {
			System.out.println("This ID does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp1.increaseSal(percent);
		}
		
		System.out.println("-=-=-=-=-=-=");
		System.out.println("Updated list of employees:");
		for (Increase obj : list) {
			System.out.println(obj);
		}
		sc.close();
	}

}
