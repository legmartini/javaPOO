package aplicacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProgramaExcept {

	public static void main(String[] args) {
		
		File file = new File("C:\\temp\\texto.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException erro) {
			System.out.println("Arquivo corrompido " + erro.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Bloco FINALLY executado!");
		}
	}
}
