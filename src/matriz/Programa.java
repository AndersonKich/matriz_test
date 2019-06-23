package matriz;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int i, j, N;
		int negativo = 0;

		
		System.out.print("Digite o numero de linhas e colunas da matriz: ");
		N = teclado.nextInt();
		int matriz[][] = new int[N][N];
		// ==============================================================================
		for (i = 0; i < matriz.length; i++) {
			System.out.print("Digite os valores da " + (1+i) + "o linha: ");
			for (j = 0; j < matriz[i].length; j++) {//matriz[i].length == quantidade de colunas na posicao [i]
				
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
			System.out.print("\n");
		}//Impressao
		// ====================================================================================
		System.out.println("Triangulo inferior ");
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				if (i < j ) {
					System.out.print(matriz[i][j]+" ");
				}
			}//Triangulo imferior
			System.out.println(" ");
		}
		
		System.out.println("Diagonal principal ");
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				if(i == j) {
					System.out.print(matriz[i][j]+" ");
				}
			}
			System.out.print("\n");
		}//Impressao
		
	
		System.out.println("Negativos: "+negativo);
		teclado.close();

	}

}
