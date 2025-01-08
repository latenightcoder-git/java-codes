// Solution 8
class print1to10{
	public static void main(String args[]){
		formethod();
		whilemethod();
		dowhilemethod();
	}
	
	static void formethod(){
		System.out.println("Printing from 1 to 10 using for loop only");
		for (int i=1;i<=10;i++){
			System.out.println(i);
		}
	}
	
	static void whilemethod(){
		int i=1;
		System.out.println("Printing from 1 to 10 using while loop only");
		while (i<=10) {
			System.out.println(i);
			i++;
		};	
	}
	
	static void dowhilemethod(){
		int i=1;
		System.out.println("Printing from 1 to 10 using do-while loop only");
		do {
			System.out.println(i);
			i++;	
		}while(i<=10);
	}
}