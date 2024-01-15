package array;

public class Exercise {
	
//	public static void main (String [] args) {
		
//1. Create an array that will hold 10 integer values, populate the array with values, then call and output each element
		
//		String[] countries = {"Argentina","Brazil","Mexico","Uruguay","Bolivia","Venezuela","Chile","Ecuador","Paraguay"};
//		for ( int i = 0; i < countries.length; i++) {
//
//			System.out.println("I: " + i + " COUNTRIES: " + countries [i]);
//		}
//2. Create a for loop that populates an integer array with values, outputting them at each iteration.
//Then create another loop that iterates through the array, changing the values at each point to equeal itself times 10, outputting them at each iteration

		
//		{
//			int [] nums = {5,10,15,20,25,30,35,40,45,50 } ;
//			for (int i = 0; i < nums.length; ++i)  {
//			        System.out.println(nums[i]);
//			      }
//		} 
//		
//		
//		{
//			int [] num = {5,10,15,20,25,30,35,40,45,50 } ;
//				for (int j = 0; j < num.length; ++j)  {
//			num[j] *=10;
//				        System.out.println(num[j]);
//				      }
//		}
		
// EXTENSION 1. Create a method that takes a number 10-99, and adds the two digits together for example 74= 7+4 = 11
		    			
//		for (int i = 10; i<= 99; i++) {
//			System.out.println("I:" + i + " SUM: " + sumDigits(i));
//		}
//	}
	
//	public static int sumDigits (int num) {
//		int sum = 0;
//		int tens = num / 10;
//		int units = num % 10;
//		
//		sum = tens + units;
//		
//		return sum;
//	}

//EXTENSION 2. Create a second method that when given the nu7mber 1-99 returns a String representation of this number, for example 1 = one, 11=eleven, 21=twenty-one
public static void main (String [] args) {
	
	for (int i = 1; i < 100 ; i++) {
		System.out.println ("NUMBER: " + i + " TEXT: " + numToString(i)); }
}
	

	public static String numToString (int num) {
	String out = "";
	String [] tensArray = {"", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	String[] unitsArray = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	String[] teensArray = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};	
	
	int tens = num / 10;
	int units = num % 10;
	
	
	if (num > 10 && num <20 ) {
		out += teensArray[units];
	} else {
	out += tensArray[tens];
	if (tens > 1 && units > 0) out += "-";
	
	out += unitsArray [units];
	}
	return out;
	
}
}







//Extension:
//	 3 Expand on the method you wrote in step 2 to allow the i8nput 1-999
//	 4. Expand the method you wrote in step 2 to allow the input 1-9999
//	 5. Use a for ()-loop to print the number 1-100 in words
//	 For exmaple 1= one, 100 = one hundred
































