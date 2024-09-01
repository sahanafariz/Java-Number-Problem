package Number;
import java.util.*;
public class PalinNum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		
		while(num>0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
			
		}
		if(rev==temp) {
			System.out.print("Palin");
		}else {
			System.out.print("no print");
		}
		
		}
	}


