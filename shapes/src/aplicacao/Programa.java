package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Color;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Forma> list = new ArrayList<>();
		
		System.out.print("Insira a quantidade de formas: ");
		int qntFormas = sc.nextInt();
		
		for (int c=1; c<=qntFormas; c++) {
			System.out.println("Forma número #" + c + ": ");
			System.out.print("Retângulo ou Círculo (r/c): ");
			char resp = sc.next().charAt(0);
			
			System.out.print("Cor da forma (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if (resp == 'r') {
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				
				list.add(new Retangulo(color, largura, altura));
			} 
			
			else if (resp == 'c') {
				System.out.print("Raio do círculo:");
				double raio = sc.nextDouble();
				
				list.add(new Circulo(color, raio));
			}
		}
		
		System.out.println();
		System.out.println("Áreas das formas: ");
		
		for (Forma forma : list) {
			System.out.println(String.format("%.2f", forma.area()));
					
		}
		
		sc.close();
	}
}
