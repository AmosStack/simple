// Collects commodity name, quantity, and price from user input.

import java.util.Scanner;

public class CommodityDetailsInput {
	public static void main (String[ ] args){
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter the commodity name:" );
	    String commodity = scanner.nextLine();
	    System.out.print( " Enter the quantity:" );
	    int quantity = scanner.nextInt();
	    System.out.print( "Enter the price :" );
	    double price = scanner.nextDouble ();
	    
	    scanner.close();
		 
		System.out.println( "Commodity name"+commodity);
	    System.out.println( "Quantity:"+quantity);
	     System.out.println( "price per unit:"+price);
}
	
	    
		
		}