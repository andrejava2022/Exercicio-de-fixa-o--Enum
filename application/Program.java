package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[]args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String nameC = sc.nextLine();
		System.out.print("Email: ");
		String emailC = sc.nextLine();
		System.out.print("Birth date: ");
		Date dateBirth = sdf.parse(sc.next());
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String statusC = sc.next();
		
		Client client = new Client(nameC,emailC,dateBirth);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Enter #"+i+" item data: ");
			System.out.print("Product name: ");
			String nameP = sc.nextLine();
			System.out.print("Product price: ");
			Double priceP = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantityP = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println();
		System.out.println(client);
	}
	
}
