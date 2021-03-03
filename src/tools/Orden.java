package tools;

public class Orden{
public String code_A;
public String name_A;
public String descrip_A;
public int amount;
public double price;
Assistant my_Assis;

	public Orden(String code, String name, String descrip, int amount,double price) {
		this.code_A=code;
		this.name_A=name;
		this.descrip_A=descrip;
		this.amount=amount;
		this.price=price;
		
}
	public Orden(Articles artic1) {
	}
	public void quien_es_mi_asistente(Assistant my_Assis) {
		this.my_Assis=my_Assis;
	}
}
