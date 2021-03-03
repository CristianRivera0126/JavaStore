package storej;

import tools.Client;
import tools.Orden;
import tools.Articles;
import tools.Assistant;
import tools.Result;

public class Application {
	public static void main(String[] args) {
		//Creamos el Cliente1
		
		Client client1=new Client("Cristian Rivera","0801200103042","3379-6777","Col. Cerro Grande");
		
		//Creamos el articulo
		Articles artic1=new Articles("UV400","Gafas","Gafas de sol de metal para mujer, estilo vintaje",2,1.79*2);
		Articles artic2=new Articles("UV459","Canon EOS","camara digital sin espejo,30.3 MP",1,1599.95);
		
		client1.asignar_articulo(artic1);
		client1.asignar_articulo(artic2);
		
		//Creamos el asistente
		System.out.println("Orden del asistente"+"\n");
	    Assistant assis1=new Assistant("Roberto Solano","0801199317896",28,"Masculino");
	    System.out.println(client1.saludo()+"\n");
	    System.out.println(assis1.SaludoA());
	   
	   
	    //Creamos la orden
	    Orden ord1=new Orden(artic1.code_A,artic1.name_A,artic1.descrip_A,artic1.amount,artic1.price);
	    Orden ord2=new Orden(artic2.code_A,artic2.name_A,artic2.descrip_A,artic2.amount,artic2.price);
	    
	    assis1.asignar_orden(ord1);
	    assis1.asignar_orden(ord2);
	    
	    
	    assis1.imprimir_orden();
	    
	    
	    //Creamos el Total
	    boolean VIP;
	    Result resul1=new Result(artic1.price,artic2.price);
	    VIP=true;
	      if(VIP==true) {
	    	  System.out.println("El total es: "+resul1.Total2()+"$");
	      }
	      else {
	    	  System.out.println("Su total a pagar es: "+resul1.Total1()+"$");
	      }
	}
}
