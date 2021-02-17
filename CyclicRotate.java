package test;

import java.util.Arrays;

public class CyclicRotate {

	public  static int[] arr = new int[] {1,2,3,4,5};
	
	public static void rotate(int[] a) {
		
		int x = a[a.length-1],i;
		for(i=a.length-1;i>0;i-- )
			a[i]=a[i-1];
		a[0]=x;
	}
	
	public static void printArr(int[] a) {
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");	
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Given arr : ");
		System.out.println(Arrays.toString(arr));
		rotate(arr);
		System.out.println("Output arr : ");
		System.out.println(Arrays.toString(arr));
		
	}

}
