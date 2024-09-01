package Number;
import java.util.*;
public class PrimeNumber {
	public static void main(String argd[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int flag=0;
		if(num==0||num==1) {
			System.out.println(num+"its not Prime Number");
		}
		else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					System.out.println(num+"its not a prime Number");
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println(num+"its a Prime Number");
		}
	}
}
