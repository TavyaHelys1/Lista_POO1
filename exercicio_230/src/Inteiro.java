import java.util.Scanner;


public class Inteiro {
	
public static void main (String[]args){
		
		Scanner input =new Scanner (System.in);
		
		int valor;
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		
		int resto1;
		int resto2;
		int resto3;
		int resto4;
		int resto5;
		
		
		
		System.out.print("digite cinco numeros:");
		valor = input.nextInt();
		
		numero1 = valor / 10000;
		resto1 = valor %10000;
		
		numero2 = resto1 / 1000;
		resto2 = resto1 % 1000;
		
		numero3 =resto2 /100;
		resto3 = resto2 %100;
		
		numero4 = resto3 /10;
		resto4 = resto3 %10;
		
		numero5 = resto4;
		
		System.out.print(""+ numero1 +"   "+numero2+"   "+numero3+"   "+numero4+"   "+"  "+numero5);
	
		
		
	}


}
