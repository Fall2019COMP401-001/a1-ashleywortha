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
		
		// Arrays store the names of customers and total cost of 
		// purchases
		String[] first = new String[customerCount];
		String [] last = new String[customerCount];
		double[] totalCost = new double[customerCount];
		
		// loop enters in the names of customers and total
		// items bought
		for(int j = 0; j < customerCount; j++) {
			first[j] = scan.next();
			last[j] = scan.next();
			
			int totalItems = scan.nextInt();
			
			// loop reads the number and name of x item bought
			double total = 0;
			for(int k = 0; k < totalItems; k++) {
				int numberOfItems = scan.nextInt();
				String itemName = scan.next();
				
				// loop that matches the item bought and
				// matches it with its price and determines
				// the total cost of purchases
				for (int l = 0; l < item.length; l++) {
					if(itemName.equals(item[l])) {
					total += (itemCost[l] * numberOfItems);
					} 
				}
			}
			totalCost[j] = total;
			
		}
		// all input entered, scanner closed
		scan.close();
		
		// helper functions to find max, minimum, and average
				int max = findValueMax(totalCost);
				int min = findValueMin(totalCost);
				double ave = findAverage(totalCost, customerCount);
				
		// print results
		System.out.println("Biggest: " + first[max] + " " + last[max] + " " + "(" + String.format("%.2f",totalCost[max]) + ")");
		System.out.println("Smallest: " + first[min] + " " + last[min] + " " + "(" + String.format("%.2f",totalCost[min])+ ")");
		System.out.println("Average: " + String.format("%.2f",ave));
		
	}
	/* findValueMax
	 * Finds and returns the maximum value in an array of doubles
	 * 
	 * Input: an array of doubles vals
	 * 
	 * Output : point in the array where maximum value is stored
	 */
	
	static int findValueMax (double[] vals) {
		// initialize current maximum to be the first item in the array
		double curMax = vals[0];
		
		// initialize return value to be the first item in the array
		int max = 0;
		
		// starting with the second value (if any), compare each value
		// in array with current maximum and replace if bigger
		
		for (int i = 1; i < vals.length; i++) {
			if (vals[i] > curMax) {
				max = i;
				curMax = vals[i];
			}
		}
		return max;
	}
	
	/* findValueMin
	 * Find and returns minimum value in an array of doubles
	 * 
	 * Input: an array of doubles vals
	 * 
	 * Output: point in the array where minimum value is stored
	 */
	
	static int findValueMin(double[] vals) {
		//initialize current minimum to be the first item in the array
		double curMin = vals[0];
		
		//initialize return value to be the first item in the array
		int min = 0;
		
		// starting with the second value (if any), compare each value
		// in array with current minimum and replace if smaller
		for (int i = 1; i < vals.length; i++) {
			if (vals[i] < curMin) {
				min = i;
				curMin = vals[i];
			}
		}
		return min;
	}
	
	/* findAverage
	 * Finds and returns the average value of an array of doubles
	 * 
	 * Input: an array of doubles and the length of the array
	 * 
	 * Output: average value of the array
	 * 
	 */
	
	static double findAverage(double[] vals, int num) {
		// initialize the average to be zero
		double average = 0;
		
		// starting with the first value of the array, adds up all
		// values of the array
		for (int i = 0; i < vals.length; i++) {
			average += vals[i];
		}
		
		// divides current average value by the length of the array
		average = average/num;
		return average;
	}
}
