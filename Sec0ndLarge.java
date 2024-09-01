package Number;

import java.util.Scanner;

public class Sec0ndLarge {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int largerst=Integer.MIN_VALUE;
		int second=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>largerst) {
				second=largerst;
				largerst=arr[i];
			}else if(arr[i]!=largerst && arr[i]>second) {
				second=arr[i];
			}
		}
		System.out.println(second);
	}
		
		

}
