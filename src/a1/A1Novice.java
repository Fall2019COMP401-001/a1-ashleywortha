package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Read and count the number of customers
		int count = scan.nextInt();
		
		// Create arrays that stores customers info
		// needed for output
		char[] name = new char[count];
		String[] last = new String [count];
		double[] totalCost = new double[count];
		
		//Read in customer info into arrays
		for (int i = 0; i < count; i++) {
			name[i] = scan.next().charAt(0);
			last[i] = scan.next();
			
			// count the total number of items customer has
			int totalItems = scan.nextInt();
			
			// loop that determines the total cost of what
			// customers bought
			double total = 0;
			for (int k = 0; k < totalItems; k++) {
				   int numberOfItem = scan.nextInt();
				   String itemName = scan.next();
				   // cost of x item
				   double costOfItem = scan.nextDouble();
				   total += numberOfItem * costOfItem;
				   }	
			totalCost[i] = total;
		}
		     
		// all input entered, so close scanner
		scan.close();
		
		
		
		// print results displayed though looping through arrays 
		for (int j = 0; j < count; j++) {
		System.out.println(name[j] + ". " + last[j]+ ": " + String.format("%.2f",totalCost[j]));
		}
	}
	
}
