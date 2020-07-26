import java.util.*;
class Example{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		int rem=0;
		int s=0;
		int m=n;
		while(n>0){
			rem=n%10;
			s=s*10+rem;
			n=n/10;
		}
		if(s==m){
			System.out.println("given no is palindrome no");
		}
		else{
			System.out.println("given no is not a palindrome no");
		}
	}
}
