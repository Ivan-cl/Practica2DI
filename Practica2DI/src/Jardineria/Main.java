package Jardineria;

public class Main {
	public static void main(String[] args) {
		
	Cliente builder = new Cliente("Paco","Ivan","Calvo",674985231,"Si","Calle Mardun","Calle Queso","Zaragoza","Aragon","España",50002,null,66666);
	
	Pedido builderPedido= new Pedido(null, null, null, "Enviado", null, null);
	System.out.println(builder);
	System.out.println(builderPedido);
	}
 
}
