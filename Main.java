package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		int n,f;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter array length : ");
	n=sc.nextInt();
	
	
	int[] a = new int[10];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("entered array : ");
	System.out.println(Arrays.toString(a));
	System.out.println("enter no. you want to get index of : ");
	f = sc.nextInt();
	search(a,f);
	sc.close();
	}
	
	static void search(int[] a, int f) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==f) {
				System.out.println("Found at index : "+i);
			}
		}
	}

}
