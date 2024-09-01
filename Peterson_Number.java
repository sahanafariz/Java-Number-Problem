package Number;
import java.util.*;
public class Peterson_Number {
	public static int factorial(int rem) {
		int fact=1;
		for(int i=0;i<rem;i++) {
			fact=fact*i;
			
		}
		return fact;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		
	
		while(num>0) {
			int rem=num%10;
			sum+=factorial(rem);
			num/=10;
			
		}
		System.out.println(sum);
		System.out.println(temp);
		if(sum==num) {
			System.out.println("peterson no");
		}else {
			System.out.println("Not peterson");
		}
		
	
	}

}
