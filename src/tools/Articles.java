package tools;

public class Articles {
	public String code_A;
	public String name_A;
	public String descrip_A;
	public int amount;
	public double price;
	

	Client my_buyer;
	
	public Articles(String code_A,String name_A,String descrip_A,int amount,double price) {
		this.code_A=code_A;
		this.name_A=name_A;
		this.descrip_A=descrip_A;
		this.amount=amount;
		this.price=price;
	}
	
	public void quien_es_mi_comprador(Client my_buyer) {
		this.my_buyer=my_buyer;
	}
}
