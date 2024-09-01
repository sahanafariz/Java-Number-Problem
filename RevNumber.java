package Number;
import java.util.*;

public class RevNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
		System.out.println(rev);
		sc.nextLine();
		String str=sc.nextLine();
		String ori="";
		String[] st=str.split(" ");
		for(int i=str.length()-1;i>=0;i--) {
			ori=ori+str.charAt(i);
		}
		System.out.println(ori);
		
	}

}
