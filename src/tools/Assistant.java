package tools;

import java.util.ArrayList;
import java.util.List;
public class Assistant {
	public String nombre_Ad;
	public String id_Ad;
	public int edad_Ad;
	public String genero_Ad;
	List<Orden> ordenes;
	List<Articles> articles;
	
public Assistant(String nombre,String id,int edad,String genero) {
		
		this.nombre_Ad=nombre;
		this.id_Ad=id;
		this.edad_Ad=edad;
		this.genero_Ad=genero;
		this.ordenes=new ArrayList<Orden>();
    }

	public String SaludoA() {
    	String SaludoA1=("Hola! mi nombre es "+this.nombre_Ad+" y sere su asistente en esta compra, mi identidad es: "+this.id_Ad+" y tengo la edad de: "+this.edad_Ad+" años"+"\n");
    	return SaludoA1;
    }

	public void asignar_orden(Orden nueva_orden) {
		nueva_orden.my_Assis=this;
		this.ordenes.add(nueva_orden);
	}
	
	public void imprimir_orden() {
		short i=1;
		for(Orden o : this.ordenes) {
			System.out.println("Su articulo numero "+i+" es el "+o.code_A+"\n"+"el articulo es un: "+o.name_A+"\n"+"su descripcion es: "+o.descrip_A+"\n"+"la cantidad de articulos que lleva son: "+o.amount+"\n"+"El precio es de: "+o.price+"$"+"\n");
			i+=1;
		}
		System.out.println("");
	}
		

}
