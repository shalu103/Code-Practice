import java.util.*;
class Example{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int large=0,count=0;
		for(int i=2;i<=n;i++){
			if(n%i==0){
				System.out.println("prime factors are"+i);
				n=n/i;
				for(int j=2;j<=i;j++){
					if(i%j==0){
						count++;
					}
				}
				if(count==1){
					if(large<i){
						large=i;
					}
				}
				count=0;
			}
			System.out.println(large);
		}
		if(n<1)
			System.out.println(n);

	}
}
