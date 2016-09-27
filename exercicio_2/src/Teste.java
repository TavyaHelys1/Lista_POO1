import java.util.Scanner;

public class Teste {
	public static void main (String[] args){
		Scanner teclado = new Scanner(System.in);
		Fatorial coisa = new Fatorial();
	    System.out.print("Digite um numero para ser fatorado: ");
	    int numero = teclado.nextInt();
	    
	    coisa.fatorial(numero);
	    
	    teclado.close();
	}




}
