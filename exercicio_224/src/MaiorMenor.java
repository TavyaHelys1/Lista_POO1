import java.util.Scanner;

public class MaiorMenor {
	
	private static Scanner input;

	public static void main(String[] args){
		
		input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		int maior = 0;
		int menor = 999;
		
		System.out.println("Digite o primeiro número: ");
		number1 = input.nextInt();
		if(number1 > maior){
			maior = number1;
		}
		if (number1 < menor){
			menor = number1;
		}
		
		System.out.println("Digite o segundo número: ");
		number2 = input.nextInt();
		if(number2 > maior){
			maior = number2;
		}
		if (number2 < menor){
			menor = number2;
		}

		System.out.println("Digite o terceiro número: ");
		number3 = input.nextInt();
		if(number3 > maior){
			maior = number3;
		}
		if (number3 < menor){
			menor = number3;
		}

		System.out.println("Digite o quarto número: ");
		number4 = input.nextInt();
		if(number4 > maior){
			maior = number4;
		}
		if (number4 < menor){
			menor = number4;
		}

		System.out.println("Digite o quinto número: ");
		number5 = input.nextInt();
		if(number5 > maior){
			maior = number5;
		}
		if (number5 < menor){
			menor = number5;
		}
		
		System.out.println("Maior = "+ maior + "\r\nMenor ="+ menor);
		
}



}
