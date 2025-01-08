// Solution 10
class primeNumberOddcheck{
	public static void main(String args[]){
		int number = Integer.parseInt(args[0]);
		boolean isPrime = isPrime(number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
		
		if (isOdd(number)) {
            System.out.println(number + " is an odd number.");
        } else {
            System.out.println(number + " is an even number. Not an odd number. ");
        }	
	}

	static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // number is divisible by i, so it's not prime
            }
        }
        return true; // number is prime
    }

    static boolean isOdd(int num) {
        return num % 2 != 0; // Returns true if num is odd, false if even
    }
}

