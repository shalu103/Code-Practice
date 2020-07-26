import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("how many no u want enter");
	    int i;
	    int n=sc.nextInt();
	    for(i=2;i<n;i++){
	        if(n%i==0)
	            break;
	    }
	    if(i==n)
	            System.out.println("prime no");
	    else
	        System.out.print("not a prime nor");
	        
	    
	    
	}
}
