//Variable Length Argument List
//Author: William Harkley
//Class: CSIS 212-D02
/* Assignment: ((Dice Rolling) Write an application to simulate the rolling of two dice.  
	The application should use an object of class Random once to roll the first die and again to roll 
	the second die.  
	The sum of the two values should then be calculated.  
	Each die can show an integer value from 1 to 6, so the sum of the clause will vary from 2 to 12, 
	with 7 being the most frequent sum, and 2 and 12 the least frequent.  
	Figure 6.21 shows the 36 possible combinations 
	of the two die.  
	Your application should roll the dice 36,000 times.  
	Use a one-dimensional array to tally the number of times each possible sum appears.  
	Display the results in a tabular format.
*/
//Last Updated: 4/19/2022

import java.security.SecureRandom;

public class WHTwoDiceRoll {

	public static void main(String[] args) {
		
		int [] freq = new int[13];
		
		SecureRandom randomNumbers = new SecureRandom();
		
		//column heading
		System.out.printf("%s%10s%n", "Die-Face", "Frequency");
		
		//first set of rolls 36,000 times
		for (int roll = 1; roll <= 36000; roll++)
			++freq[1 + randomNumbers.nextInt(12)];
		
		//outputs each array element's value
		for (int face = 1; face < freq.length; face++)
			System.out.printf("%4d%10d%n", 
					face, freq[face]);
		
		System.out.println();
	}
}
