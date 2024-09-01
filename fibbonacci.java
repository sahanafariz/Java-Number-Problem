package Number;
import java.util.*;
public class fibbonacci {
	public static void main(String args[] ) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
			int term1=-1;
			int term2=1;
			int count=0;
			int term3=0;
			int sum=0;
			for(int i=1;i<=num+1;i++)
			{
			term3=term1+term2;
			//if(term3<=10) {
				//count++;
			
				
			System.out.print(term3+" ");
			sum+=term3;
			
			//}
			
			
			term1=term2;
			term2=term3;
			
		}
			System.out.println();
			System.out.println(term3);
			System.out.println(sum);

			
			 //int n = sc.nextInt(); // Example input using recursion 
		        System.out.println(fibonacci(num));
		    }

		    public static int fibonacci(int num) {
		        if (num <= 1) {
		            return num;
		        }
		        return fibonacci(num - 1) + fibonacci(num - 2);
	}

}
