package matriz;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int i, j, N;
		int negativo = 0;
		int N1 = 1;
		int cc = 1;

		System.out.println("Digite um numero inteiro: ");
		N = teclado.nextInt();
		int matriz[][] = new int[N][N];
		// ==============================================================================
		for (i = 0; i < matriz.length; i++) {//matriz.length == quantidade de linhas
			for (j = 0; j < matriz[i].length; j++) {//matriz[i].length == quantidade de colunas na posicao [i]
				System.out.println("Numero: ");
				matriz[i][j] = teclado.nextInt();
			}
		}//Atribuir valores
		// ===============================================================================

		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					negativo++;
				}
			}
		}//contagem de negativos
		// ==================================================================================

		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {

				System.out.print(matriz[i][j] + " ");

			}
			System.out.println("\n");
		}//Impressao
		// ====================================================================================
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				if (i > j) {
					System.out.print(matriz[i][j]+" ");
				}
			}//Triangulo imferior
			System.out.println(" ");
		}
		
		System.out.println("\n");
		System.out.println("Negativos: "+negativo);
		teclado.close();

	}

}
