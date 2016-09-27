
public class Fatorial {
	public void fatorial(int nume){
		int mult = 1;
		int cont =  nume;
		System.out.print(nume +"!=");
		while (cont > 1){
			mult *= cont;
			System.out.print(cont +"*");
			cont--;
			
		}
		System.out.println("1 = "+mult);
	}


}



