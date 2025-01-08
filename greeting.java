// Solution 7
class greeting{
	public static void main(String args[]){
		greetingUser(args) ;
	}
	
	static void greetingUser(String args[]){
		if (args.length != 3) {
            System.out.println("Please provide only three strings as command line argument.");
            return;
		}
		greetUser(args[0], args[1], args[2]);
	}
	
	public static void greetUser(String str1, String str2, String str3) {
    
        System.out.println("Checking the lengths of the strings...");

        switch (getStringLength(str1)) {
            case 0 , 1 , 2 :
                System.out.println("First string is too short.");
                break;
            default:
                System.out.println("First string is valid! Greeting...");
                break;
        }

        switch (getStringLength(str2)) {
            case 0 , 1 , 2:
                System.out.println("Second string is too short.");
                break;
            default:
                System.out.println("Second string is valid! Greeting...");
                break;
        }

        switch (getStringLength(str3)) {
            case 0 , 1 , 2 :
                System.out.println("Third string is too short.");
                break;
            default:
                System.out.println("Third string is valid! Greeting...");
                break;
        }
    }

    public static int getStringLength(String str) {
        return str.length();
    }
}