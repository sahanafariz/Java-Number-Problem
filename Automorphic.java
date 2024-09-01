package Number;
import java.util.*;
public class Automorphic {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int squ=num*num;
		String numberStr=String.valueOf(num);
		String squareStr=String.valueOf(squ);
		 if (squareStr.endsWith(numberStr)) {
	            System.out.println(num + " is an Automorphic number.");
	        } else {
	            System.out.println(num + " is not an Automorphic number.");
	        }
	        
	}
}
