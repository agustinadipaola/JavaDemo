package array;

public class Exercise {
	
	public static void main (String [] args) {
		
		String[] countries = {"Argentina","Brazil","Mexico","Uruguay","Bolivia","Venezuela","Chile","Ecuador","Paraguay"};
		for ( int i = 0; i < countries.length; i++) {

			System.out.println("I: " + i + " COUNTRIES: " + countries [i]);
		}

		
		{
			int [] nums = {5,10,15,20,25,30,35,40,45,50 } ;
			for (int i = 0; i < nums.length; ++i)  {
			        System.out.println(nums[i]);
			      }
		} 
		
		
		{
			int [] num = {5,10,15,20,25,30,35,40,45,50 } ;
				for (int j = 0; j < num.length; ++j)  {
			num[j] *=10;
				        System.out.println(num[j]);
				      }
		}
		    			
		
	}

}





//1. Create an array that will hold 10 integer values, populate the array with values, then call and output each element
//2. Create a for loop that populates an integer array with values, outputting them at each iteration.
//Then create another loop that iterates through the array, changing the values at each point to equeal itself times 10, outputting them at each iteration
//
//Extension:
//	 1. Create a method that takes a number 10-99, and adds the two digits together for example 74= 7+4 = 11
//	 2. Create a second method that when given the nu7mber 1-99 returns a String representation of this number, for example 1 = one, 11=eleven, 21=twenty-one
//	 3 Expand on the method you wrote in step 2 to allow the i8nput 1-999
//	 4. Expand the method you wrote in step 2 to allow the input 1-9999
//	 5. Use a for ()-loop to print the number 1-100 in words
//	 For exmaple 1= one, 100 = one hundred
































