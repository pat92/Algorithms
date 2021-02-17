package test;

import java.util.Arrays;

public class GFC {
	
	static boolean hasArrayTwoCandidates(int[] a, int n, int sum) {
		
		int l, r;
		
		Arrays.sort(a);
		l=0;
		r=n-1;
		
		while(l<r) {
			if(a[l]+a[r] == sum) return true;
			else if (a[l]+a[r]<sum)  l++;
			else r--;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// 
		int a[] = new int[] {4,5,6,0,1,2,3};
		 if (hasArrayTwoCandidates(a,a.length, 99))
	            System.out.println("Array has two "
	                               + "elements with given sum");
	        else
	            System.out.println("Array doesn't have "
	                               + "two elements with given sum");

	}

}
