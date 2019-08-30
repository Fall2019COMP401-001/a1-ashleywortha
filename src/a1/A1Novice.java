package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Read and count the number of customers
		int count = scan.nextInt();
		
		// Create arrays that stores customers info
		char[] name = new char[count];
		String[] last = new String [count];
		double[] totalCost = new double[count];
		//Read customer info into arrays
		for (int i = 0; i < count; i++) {
			// array for first letter of first name
			name[i] = scan.next().charAt(0);
			// array for last name
			last[i] = scan.next();
			// count the total number of items customer has
			int totalItems = scan.nextInt();
			double total = 0;
			for (int k = 0; k < totalItems; k++) {
				   // number of x item
				   int numberOfItem = scan.nextInt();
				   // name of item
				   String itemName = scan.next();
				   // cost of x item
				   double costOfItem = scan.nextDouble();
				   total += numberOfItem * costOfItem;
				   }	
			totalCost[i] = total;
		}
		     
		// all input entered, so close scanner
		scan.close();
		
		
		
		// print results looped in 
		for (int j = 0; j < count; j++) {
		System.out.println(name[j] + ". " + last[j]+ ": " + String.format("%.2f",totalCost[j]));
		}
	}
	
}
