package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lista {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Ana");
		list.add("Alberto");
		list.add("Maria");
		list.add("Luiz");
		list.add("Laura");
		
		list.add(2, "Carlos");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("Tamanho da lista: " + list.size() + " elementos" );
		System.out.println("");
		System.out.println("Posição da Laura: " + list.indexOf("Laura"));
		
		list.remove("Luiz");
		list.remove(2);
		
		list.removeIf(x -> x.charAt(0) == 'A');
		
		System.out.println("");
		System.out.println("Depois das remoções a lista remanescente é: ");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("Tamanho da lista: " + list.size() + " elementos" );
		System.out.println("");
		System.out.println("Posição da Laura: " + list.indexOf("Laura"));
		
		if (list.indexOf("Luiz") == -1) {
			System.out.println("O elemento Luiz não está contido na Lista.");
		}
		
		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		
		System.out.println("");
		System.out.println("Elementos que restaram: ");
		for (String x : resultado) {
			System.out.println(x);
		}
		
		String primeiroNome = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
		
		System.out.println(primeiroNome);
	}
}
