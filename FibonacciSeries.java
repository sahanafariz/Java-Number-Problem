package Number;
import java.util.*;

public class FibonacciSeries {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=-1;
		int num2=1;
		//System.out.print(num1+" "+num2+" ");
		int num3 = 0;
		for(int i=0;i<num;i++) {
		num3=num1+num2;
		System.out.print(num3+" ");
		num1=num2;
		num2=num3;
		
		
		}
		
	
	}

}
