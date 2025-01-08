// Solution 9
class findFactorial{
	public static void main(String args[]){
		factorial(args);
	}
	
	static void factorial(String args[]){
		if (args.length != 1) {
            System.out.println("Please provide exactly one number as command-line argument.");
            return;
        }
		int number = Integer.parseInt(args[0]);
	    int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
		
	}
		
	public static int factorial(int num) {
		if (num < 0) {
			System.out.println("Factorial is not defined for negative numbers.");
			return -1;  
		}

		int result = 1;
        
        for (int i = num; i > 0; i--) {
            result *= i;
        }
        return result;
	}
	
}