import java.util.*;
class Example{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++){
			while(n%i==0){
				System.out.println("prime factors are"+i);
				n=n/i;
			}
		}
		if(n<1)
			System.out.println(n);

	}
}
