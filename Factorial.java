package Number;
import java.util.*;
public class Factorial {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		
			System.out.print(fact+" ");
			
		}
		System.out.println();
		int res=Factorial(num);
		System.out.println(res);
		
	}
	static int Factorial( int num)
    {
            if ( num == 0)
                    return 1;//BASCE CASE 
            return num * Factorial(num -1);//RC
    }
		

}
