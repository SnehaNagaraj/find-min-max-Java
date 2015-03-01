/**
 * 
 */
package findmaxandmin;

import java.util.Random;

/*
 * The program was created to find the largest and smallest number in an array
 */

public class findmaxandmin {

	public static void main(String[] args) {
				
		int[] anarray;
		
		Random rand = new Random();
		anarray = new int[5];
		
	 	for (int index = 0; index < 5; index++) {
			
			anarray[index] = rand.nextInt(100);
			
			System.out.println("Index " + index + " Value " + anarray[index]);
		}

		int largest_value = anarray[0];
		int smallest_value = anarray[0];
		
		//Loop to find the largest and smallest number
		for (int index = 0; index < 5; index++) {
			
			// condition to find the largest number
			if (largest_value < anarray[index]) {
				largest_value = anarray[index];
			}
			
			// condition to find the smallest number
			if (smallest_value > anarray[index]) {
				smallest_value = anarray[index];
			}
			
		}
 		
		System.out.println();
		System.out.println("The biggest value is " + largest_value);
		System.out.println("The samllest value is " + smallest_value);
		
	}

}
