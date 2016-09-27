
public class Employee {
	
	String nome;
	String sobrenome;
	double salario;
	double aumento= 0.10;
	
	public Employee (int iniciaQuant, double salario){
		if(iniciaQuant >0){
			salario =iniciaQuant;
		}else{
			salario = 0;}
		}
		
	public void setnome(String Nome){
		nome = Nome;
	}
	public String getNNome(){
		return nome;
		
	}
	public void setsobrenome(String Sobrenome){
		sobrenome = Sobrenome;
	}
	public String getSobrenome(){
		return sobrenome;
		
	}
		
		public void setSalario(double valor){
			salario = valor;
		}
		public int getSalario(){
			return (int) salario;	
	}
		public double GetEmployeeAmout(){
			double total = salario * 12;
			return total;

}
		public double GetEmployee(){
			double novoaumento = salario * aumento;
			return novoaumento;	
}


}
