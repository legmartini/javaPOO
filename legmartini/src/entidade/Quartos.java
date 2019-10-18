package entidade;

public class Quartos {
	
	private static String nome;
	private static String email;
	private static int quarto;
	
	public Quartos(String nome, String email, int quarto) {
		Quartos.nome = nome;
		Quartos.email = email;
		Quartos.quarto = quarto;
	}

	public static String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		Quartos.nome = nome;
	}

	public static String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		Quartos.email = email;
	}
	
	public static int getQuarto() {
		return quarto;
	}
	public void setQuarto(int quarto) {
		Quartos.quarto = quarto;
	}
	
}
