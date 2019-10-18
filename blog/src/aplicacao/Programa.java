package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Tenha uma boa viagem!");
		Comentario c2 = new Comentario("Isso é muito legal.");
		
		Post p1 = new Post(
				sdf.parse("21/06/2019 13:05:35"), 
				"Viajando para Nova Zelândia!",
				"Vou visitar esse país!",
				12
				);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Post p2 = new Post(
				sdf.parse("21/06/2021 13:05:35"), 
				"Voltando para o Brasil!",
				"Vou sair desse país!",
				19
				);
		p2.addComentario(c1);
		p2.addComentario(c2);
		
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
	}
}
