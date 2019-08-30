package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		//Read the number of items in the store
		int itemCount = scan.nextInt();
		
		//Arrays that store the name of the item and the price
		String[] item = new String[itemCount];
		double[] itemCost = new double[itemCount];
		
		// loop that enters in the names and costs of the items
		for(int i = 0; i < itemCount; i++) {
			item[i] = scan.next();
			itemCost[i] = scan.nextDouble();
		}
		
		// read the number of customers
		int customerCount = scan.nextInt();
		
		// Arrays that store names of customers and total cost of 
		// purchases
		String[] first = new String[customerCount];
		String [] last = new String[customerCount];
		double[] totalCost = new double[customerCount];
		
		// loop that enters in the names of customers and total
		// items bought
		for(int j = 0; j < customerCount; j++) {
			first[j] = scan.next();
			last[j] = scan.next();
			//read number of items bought
			int totalItems = scan.nextInt();
			// stores total cost of items
			double total = 0;
			
			for(int k = 0; k < totalItems; k++) {
				// read number of item x bought
				int numberOfItems = scan.nextInt();
				// read name of item bought
				String itemName = scan.next();
				// loop that finds the item bought and
				// matches it with its price 
				for (int l = 0; l < item.length; l++) {
					if(itemName.equals(item[l])) {
					total += (itemCost[l] * numberOfItems);
					} 
				}
			}
			totalCost[j] = total;
			
		}
		scan.close();
		// helper functions to find max, minimum, and average
				int max = findValueMax(totalCost);
				int min = findValueMin(totalCost);
				double ave = findAverage(totalCost, customerCount);
				
				
		System.out.println("Biggest: " + first[max] + " " + last[max] + " " + "(" + String.format("%.2f",totalCost[max]) + ")");
		System.out.println("Smallest: " + first[min] + " " + last[min] + " " + "(" + String.format("%.2f",totalCost[min])+ ")");
		System.out.println("Average: " + String.format("%.2f",ave));
		
	}
	static int findValueMax (double[] vals) {
		double curMax = vals[0];
		int max = 0;
		for (int i = 1; i < vals.length; i++) {
			if (vals[i] > curMax) {
				max = i;
			}
		}
		return max;
	}
	static int findValueMin(double[] vals) {
		double curMin = vals[0];
		int min = 0;
		for (int i = 1; i < vals.length; i++) {
			if (vals[i] < curMin) {
				min = i;
			}
		}
		return min;
	}
	static double findAverage(double[] vals, int num) {
		double average = 0;
		for (int i = 0; i < vals.length; i++) {
			average += vals[i];
		}
		average = average/num;
		return average;
	}
}
