import java.util.Scanner;
public class Impar {
	
	private static int impar;
	private static Scanner input;

	public static void main(String[] args){
		
		input = new Scanner(System.in);
		
		int number1;
		System.out.println("Digite um n�mero: ");
		number1 = input.nextInt();
		
		if(number1 % 2 == 0 ){
			System.out.println("O n�mero � par!");
		}else{
			impar = number1;
			System.out.println("O n�mero � impar!");
		}
	
		
		
	}




}
