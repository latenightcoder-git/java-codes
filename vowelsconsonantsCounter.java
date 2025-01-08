// Solution 2
class vowelsconsonantsCounter{
	public static void main(String args[]){
		displaycounts(args);
	}
	
	static void displaycounts(String args[]){
		if (args.length == 0) {
            System.out.println("Please provide your name as a command line argument.");
            return;
        }
		String name=args[0].toUpperCase();
		System.out.println("The name received is: "+name);
		int vowels = 0, consonants = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
				vowels++ ; 
			}
			else consonants++ ;
		}
		System.out.println("No. of vowels: "+vowels);
		System.out.println("No. of consonants: "+consonants);
	}
}