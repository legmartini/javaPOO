package aplicacao;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Número de Linhas: ");
		int linhas = sc.nextInt();

		System.out.print("Número de Colunas: ");
		int colunas = sc.nextInt();

		int[][] matriz = new int[linhas][colunas];

		for (int l = 0; l < linhas; l++) {
			for (int c = 0; c < colunas; c++) {
				matriz[l][c] = sc.nextInt();
			}
		}
		
		System.out.print("Digite um número que esteja contido na Matriz: ");
		int x = sc.nextInt();

		for (int l = 0; l < linhas; l++) {
			for (int c = 0; c < colunas; c++) {
				if (matriz[l][c] == x) {
					System.out.println("Linha " + l + " | Coluna" + c + ":");
					if (c > 0) {
						System.out.println("a esquerda: " + matriz[l][c-1]);
					}
					if (l > 0) {
						System.out.println("acima: " + matriz[l-1][c]);
					}
					if (c < matriz[l].length-1) {
						System.out.println("a direita: " + matriz[l][c+1]);
					}
					if (l < matriz.length-1) {
						System.out.println("abaixo: " + matriz[l+1][c]);
					}
				}
			}
		}
		sc.close();
	}
}
