import java.util.Scanner;


public class Teste {
	
	private static Scanner teclado;

	public static void main(String[] args){
		teclado = new Scanner(System.in);
		String variavel = teclado.nextLine();
		System.out.print("DIGITE O PRIMEIRO NUMERO");
		int num1= teclado.nextInt();
		
		System.out.println("digite o segundo numero");
		int num2= teclado.nextInt();
		
		Soma prog = new Soma();
		prog.soma(num1, num2);
		prog.Diferenca(num1,  num2);
		prog.Mult(num1,num2);
	    prog.Quociente(num1, num2);
		}




}
