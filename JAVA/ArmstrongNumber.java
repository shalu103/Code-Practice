import java.util.*;
class Example{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int num = sc.nextInt();
		int s=0;
		int rem=0;
		int m = num;
		while(num>0){
			rem =num%10;
			s=s+rem*rem*rem;
			num/=10;
		}
		if(s==m){
			System.out.println("Armstrong no.");
		}
		else{
			System.out.println("Not an Armstrong no");
		}
	}
}
