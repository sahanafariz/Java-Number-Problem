package Number;
import java.util.*;
public class prime {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==0||num==1) {
			System.out.println("Not a Prime");
		}
		else {
			for(int i=1;i<num;i++) {
				
			if(num%i==0) {
			System.out.println(" not Prime Num");
			}
			}

			
		}
		}
		
	}


