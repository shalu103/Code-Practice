import java.util.*;
class Example{
	public static void main(String []args){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){			
			for(int s = 0;s<=i;s++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
