import java.util.Scanner;
public class Teste {
	
public static void main(String[]args){
		
		Scanner input= new Scanner (System.in);

		System.out.println("digite seu nome");
		String number = input.nextLine();
		
		System.out.println("digite seu sobre nome");
		String sobrenome = input.nextLine();
	
		System.out.println("digite o salario");
		double salario = input.nextDouble();
		if(salario>0){
			double maior = salario*12;
			System.out.println("salario anual:  "+maior);
		}
		if(salario>1){
			double pocento= salario*0.10*12;
			double novodimdim = salario+pocento;
			System.out.println("aumento de 10% em relacao ao salario anual:   "+pocento);
			System.out.print("salario anual com aumento:  "+novodimdim);
			
		}else{
			System.out.print("salario invalido");
		}
		
		
		
	}



}
