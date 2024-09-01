package Number;

import java.util.Scanner;

public class ThirdLargest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int largerst=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>largerst) {
				third=second;
				second=largerst;
				largerst=arr[i];
			}else if(arr[i]!=largerst && arr[i]>second) {
				second=arr[i];
			}else if(arr[i]!=second&&arr[i]!=largerst&&arr[i]>third) {
				third=arr[i];
			}
		}
		System.out.println(largerst);
		System.out.println(second);
		System.out.println(third);
	}

}
