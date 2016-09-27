
public class Invoice {
	
	String num;
	String desc;
	int quant;
	double preco;
	
	
	public Invoice (int inicia, double valor){
		if (inicia >0){
			quant =inicia;
		}else{
			quant = 0;
		}
		if(valor > 0.0){
			preco = valor;
			
		}else{
			preco = 0.0;
		}
		
	}
	public void setQuant(int quantid){
		quant = quantid;
	}
	public void setNum(String numero){
		num = numero;
	}
	public void setDesc(String descricao){
		desc = descricao;
	}
	public void setPreco( double valor){
		preco = valor;
	}
	public int getQuant(){
		return quant;
	}
	public String getNum(){
		return num;
	} 
	public String getDescricao(){
		return desc;
	}
	public double getPreco(){
		return preco;
	
	}
	public double GetInvoiceAmout(){
		double total = quant * preco;
		return total;
	}
	public String GetInvoiceAmout1() {
		// TODO Auto-generated method stub
		return null;
	}


}
