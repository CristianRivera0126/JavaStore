package tools;

public class Result {
	public double price1;
	public double price2;
	public double Desc;
	public double ISR;
	public double Total1;
	public double Total2;
	
	public Result(double price1,double price2) {
		this.price1=price1;
		this.price2=price2;
	}
	
	public double Total1() {
		Total1=price1+price2;
	       ISR=Total1*0.15;
	       Total1=Total1+ISR;
	       return Total1;
	}
	       
	public double Total2(){
	   		Total1=price1+price2;
	   		   Desc=(this.price1+this.price2)*0.2;
	   	       ISR=(Total1-Desc)*0.15;
	   	       Total2=(Total1-Desc)+ISR;
	   	       return Total2;
	}
}
