import java.util.Scanner;

public class output {

	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		
		// Declaracion de variables
		String item;
		double price;
		
		// Solicitud y Captura 
		System.out.print("\nNombre del articulo: ");
		item = c.next();
		
		System.out.print("Precio del articulo: ");
		price = c.nextDouble();
		
		// Imprimir resultado 
		System.out.println("\nArticulo: " + item);
		System.out.println("\t$ " + price);

		
	}

}
