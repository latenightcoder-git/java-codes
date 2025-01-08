// Solution 6
class userLogin{
	public static void main(String args[]){
		loginCheck(args);
	}
	
	static void loginCheck(String args[]){
		if (args.length == 0) {
            System.out.println("Please provide your username and password as a command line argument.");
            return;
		}
		String username = args[0].toUpperCase();
		String password = args[1].toUpperCase();
		switch (username) {
            case "ANKAN" , "SOUPARNA":
                // Checking password based on username and now password 
                switch (password) {
                    case "MADHU" , "TRISHA":
                        System.out.println("Login successful!");
                        break;
                    default:
                        System.out.println("Invalid password.");
                        break;
                }
                break;
            default:
                System.out.println("Invalid username.");
                break;
        }
	}
}