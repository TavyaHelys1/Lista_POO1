import java.util.Scanner;


public class Matrizes {
	
	private static Scanner scan;

	public static void main(String[]args){
		
	
		int [][] matriz1;
		int [][] matriz2;
		int linha1;
		int coluna1;
		int linha2;
		int coluna2;
		double[][] m3 = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linha da 1° matriz:");
		linha1 = scan.nextInt();
		
		System.out.print("Digite a  quantidade de coluna da 1º matriz:");
		coluna1 = scan.nextInt();
		
		System.out.print("Digite a quantidade de linhas da 2º matriz:");
		linha2 = scan.nextInt();
		
		System.out.println("Digite a quantidade de colunas da 2º matriz:");
		coluna2 = scan.nextInt();
		
		matriz1 = new int [linha1][coluna1];
		
		for (int i = 0; i < matriz1.length; i++){
			for(int j = 0; j < matriz1[0].length; j++){
				System.out.print("Digite um valor para linha:" +(i+1) + "e coluna: " +(j+1)+": ");
			    matriz1[i][j] = scan.nextInt();
			}
		
			
		}
		matriz2 = new int [linha2][coluna2];
		
		for (int g = 0; g < matriz2.length; g++){
			for(int k = 0; k < matriz2[0].length; k++){
				System.out.print("Digite um valor para linha:" +(g+1) +" e coluna: " +(k+1)+":");
				matriz2[g][k] = scan.nextInt();
				
			}
		}
		
	System.out.print("Sua Matriz 1!\n");	
	
	for (int i = 0; i < matriz1.length; i++){
		for (int j = 0; j < matriz1[0].length; j++){
		System.out.print(matriz1[i][j]+ " ");
		}
		System.out.println();
		
	}
	System.out.print("Sua Matriz 2!\n");
	for (int g = 0; g < matriz2.length; g++ ){
		for (int k = 0; k < matriz2[0].length; k++){
		System.out.print(matriz2[g][k]+ " ");
		}
		System.out.println();
	}
	
	if (matriz1[0].length == matriz2.length) {

		m3 = new double[matriz1.length][matriz2[0].length];

		for (int i = 0; i < m3.length; i++) {

			for (int j = 0; j < m3[0].length; j++) {

				for (int k = 0; k < matriz1[0].length; k++) {

					m3[i][j] += matriz1[i][k] * matriz2[k][j];

				}
			}
		}

		System.out.print("Sua matriz 3 é :\n");
		for (int i = 0; i < m3.length; i++) {
			for (int j = 0; j < m3[0].length; j++) {
				System.out.print(m3[i][j] + " ");
			}
			System.out.println();
		}

	} else {
		System.out.println("Não é possível a multiplicação!");
	
	}
	
	}	
	
	
}







