package practice;

public class revNumber {

	public static void main(String[] args) {
	int num=456; 
	int rem , rev=0;
	while(num!=0) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
	}
	System.out.println(rev);
	}
	
}
