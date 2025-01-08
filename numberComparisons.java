// Solution 3
import java.lang.Math;
class numberComparisons{
	public static void main(String args[]){
		displaysmallest(args);
	}
	
	static void displaysmallest(String args[]){
		if (args.length != 3) {
            System.out.println("Please provide exactly three numbers.");
            return;
        }
		int number1 = Integer.parseInt(args[0]) ;
		int number2 = Integer.parseInt(args[1]) ;
		int number3 = Integer.parseInt(args[2]) ;
		int largestno = Math.max(number1,number2);
		int sum = number1 + number2;
		int smallest = Math.min(sum, number3);
		System.out.println("The smallest between the sum of the first two numbers and the third number is: " + smallest);
	}
}