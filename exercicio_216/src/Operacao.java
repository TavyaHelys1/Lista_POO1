import java.util.Scanner;
public class Operacao {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		int maior;
		
		System.out.println("Digite o primeiro o n�mero: ");
		int number1 = input.nextInt();
		
		System.out.println("Digite o segundo o n�mero: ");
		 int number2 = input.nextInt();
		
		
		if(number1 == number2){
			System.out.println("Os n�meros s�o iguais! \r\n");
		}
		if(number1 > number2){
			maior = number1;
			System.out.println("O primeiro n�mero � maior! \r\n");
		}
		if(number2 > number1){
			maior = number2;
			System.out.println("O segundo n�mero � maior! \r\n");
		}
		
		
}}


