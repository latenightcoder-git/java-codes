// Solution 5
class sum{
	public static void main(String args[]){
		displaysum();
	}	
	
	static void displaysum(){
		int sum = 0 ;
		for (int i=1;i<=20;i++){
			if (i%2==0){
				sum+=i;
			}
			else {
				continue;
			}
		}
		System.out.println("Sum of even numbers from 1 to 20 is : "+sum);	
	}
}