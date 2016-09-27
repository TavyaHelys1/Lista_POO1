import java.util.Scanner;


public class Numero {
	
	public static void main(String[]args){
		

		
		Scanner input = new Scanner(System.in);
		

		int j = 1;
		int h = 1;
		
		for (int i = 1; i < 6; ) {
			System.out.print("digite um numero:");
			int num=input.nextInt();

			
			if(num>0){
			int	positivo=i++;
				System.out.println("positivos:  "+ positivo);
			}
			if(num<0){
			int negativo=j++;
				System.out.println("negativos:   "+ negativo);
			}
			if(num==0){
			int	zero= h++;
				System.out.println("igual a zeros:   "+zero);
			}
			
			
		
			
		}
	}


}
