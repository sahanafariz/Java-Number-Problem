package Number;
import java.util.Scanner;
public class FiboRecur {
	       public static void main(String args[])
	        {
	                Scanner inp = new Scanner(System.in);
	                int num;
	                num = inp.nextInt();
	                int itr, term1, term2, term3;
	                term1 = -1;
	                term2 = 1;
	               // System.out.print(term1 +" "+ term2+" ");
	                for (itr = 1; itr <= num; itr++ )
	                {
	                        term3 = term1 + term2;
	                        System.out.print(term3+" ");
	                        term1 = term2;
	                        term2 = term3 ;
	                }

	        }
	}