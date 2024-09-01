package Number;
import java.util.*;
public class PalinStr {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//malayalamsc.close();
		//using while loop
		int left=0;
		int right=str.length()-1;
		boolean b=true;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				b=false;
			}
				left++;
				right--;
				
			
			
			
		}
		if(b==true) {
			System.out.print("Palindrome");
		}else {
			System.out.print("not palindrome");
		}
		//for loop using
		String str1=sc.nextLine();
		
		for(int i=0;i<str1.length()/2;i++) {
			if(str1.charAt(i)!=str1.charAt(str1.length()-1-i)) {
				b=false;
			}
		}
		if(b==true) {
			System.out.print("Palindrome");
		}else {
			System.out.print("not palindrome");
		}
		String ori=sc.nextLine();
		String rev="";
		sc.close();
		for(int i=ori.length()-1;i>=0;i--) {
			rev=rev+ori.charAt(i);
			
		}
		if(rev.equals(ori)) {
			System.out.println(" it is Palindrome");
		}else {
			System.out.println("IT not palindrome");
		}
		
	}
}