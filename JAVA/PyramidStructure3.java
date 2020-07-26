import java.util.*;
class Example{
	public static void main(String []args){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=n-i;j>1;j--){
				System.out.print(" ");
			}
			for(int s = 0;s<=i;s++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
