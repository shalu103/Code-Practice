import java.util.*;
class PascalTriangle{
	public static void main(String []args){
		int number,line,value=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		int rows = sc.nextInt();
		for(int i=0;i<rows;i++){     //rows
			for(int s=0;s<(rows-i-1);s++){    //space
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){     //values
				value = Binomial(i,j);
				Sytem.out.print(value+" ");
			}
				
			System.out.println();
		}
	}
	static int Binomial(int line,int col){
		if(col==0 || line==col){
			return 1;
		}
		else
			return(Binomial(line-1,col-1)+Binomial(line-1,col));
				
			
		}
	}
}
