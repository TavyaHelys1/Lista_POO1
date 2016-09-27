import java.util.Scanner;
public class Operacao {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		int maior;
		
		System.out.println("Digite o primeiro o número: ");
		int number1 = input.nextInt();
		
		System.out.println("Digite o segundo o número: ");
		 int number2 = input.nextInt();
		
		
		if(number1 == number2){
			System.out.println("Os números são iguais! \r\n");
		}
		if(number1 > number2){
			maior = number1;
			System.out.println("O primeiro número é maior! \r\n");
		}
		if(number2 > number1){
			maior = number2;
			System.out.println("O segundo número é maior! \r\n");
		}
		
		
}}


