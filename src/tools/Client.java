package tools;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public String name_cl;
	public String id_cl;
	public String phone_cl;
	public String addres_cl;
	public String shopcar;
	public String shophist;
	
	
	List<Articles> articles; 
	
	public Client(String name,String id,String phone,String addres) {
		
		this.name_cl=name;
		this.id_cl=id;
		this.phone_cl=phone;
		this.addres_cl=addres;
		this.articles=new ArrayList<Articles>();
	}

	public String saludo() {
		String saludocl="Hola! mi nombre es "+this.name_cl+" y mi ID es "+this.id_cl+" y mi telefono es "+this.phone_cl+"\n";
		return saludocl;
	}
	
	public void asignar_articulo(Articles nuevo_articulo) {
		nuevo_articulo.my_buyer=this;
		this.articles.add(nuevo_articulo);
		
	}
	
    public void imprimir_mis_articulos() {
		short i=1;
		for(Articles a : this.articles) {
			System.out.println("Mi articulo numero "+i+" es el "+a.code_A+"\n"+"el articulo es un: "+a.name_A+"\n"+"su descripcion es: "+a.descrip_A+"\n"+"la cantidad de articulos que lleva son: "+a.amount+"\n"+"El precio es de: "+a.price+"$"+"\n");
			i+=1;
		}
		System.out.println("");
	}
	
}
