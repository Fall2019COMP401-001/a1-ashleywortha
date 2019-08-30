package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		//Read the number of items in the store
				int itemCount = scan.nextInt();
				
				//Arrays that store the name of the item and the price
				String[] item = new String[itemCount];
				double[] itemCost = new double[itemCount];
				
				//arrays that store the total number of items
				// and total number of customers who bought x item
				int[] totalItem = new int[itemCount];
				int[] totalCustomer = new int[itemCount];
				
				// loop that enters in the names and costs of the items
				for(int i = 0; i < itemCount; i++) {
					item[i] = scan.next();
					itemCost[i] = scan.nextDouble();
				}
				
				
				// read the number of customers
				int customerCount = scan.nextInt();
				
				//loop that scans the name of customers
				// and the number of items bought
				for(int j = 0; j < customerCount; j++) {
					String first = scan.next();
					String last = scan.next();
					int itemsBought = scan.nextInt();
					
					// loop that scans the number of x item
					// and scans the name of x item
					for(int l = 0; l < itemsBought; l++) {
						int numberOfItem = scan.nextInt();
						String itemName = scan.next();
						
						// loop that searches for the name of the
						// item in the store and adds the number of
						// the item bought to the total item array
						// and adds the customer to the total customer
						// array
						for(int m = 0; m < item.length; m++) {
						if (item[m].equals(itemName)) {
							if(totalItem[m] < 1) {
								totalCustomer[m] += 1;
							}
							totalItem[m] += numberOfItem;
						} 
					}
				}
		
	}
				scan.close();
				for(int n = 0; n < itemCount; n++) {
					if (totalCustomer[n] < 1) {
						System.out.println( "No customers bought " + item[n]);
					} else {
					System.out.println(totalCustomer[n] + " customers bought " + totalItem[n] + " " + item[n]);
				}
				}
}
}
