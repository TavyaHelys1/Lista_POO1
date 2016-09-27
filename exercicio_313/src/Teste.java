import java.util.Scanner;


public class Teste {
	public static void main(String[]args){
		Scanner input = new Scanner (System.in);
		
		System.out.println("digite o codigo do produto:  ");
		String number = input.nextLine();
		
		System.out.println("descriçao do produto:  ");
		String desc = input.nextLine();
		
		System.out.println("quantidade de produto:  ");
		int quant = input.nextInt();
		
		System.out.println("valor por  um item:  ");
		double valor = input.nextDouble();
		
		Invoice arg = new Invoice(quant, valor);
		arg.setNum(number);
		arg.setDesc(desc);
		
		System.out.println("numero:  "+arg.getNum()+"\nDescriçao:  "+arg.getDescricao()+"\nQuantidade:  "+arg.getQuant()+"\nValor:  "+arg.getPreco());
		
		System.out.println();
		System.out.println("o valor total:  "+ arg.GetInvoiceAmout());
		
		
		
		
	}



}
