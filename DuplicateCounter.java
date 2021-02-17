package test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1 ,2,3,3,7,8,8,9};
		Set<Integer> s = new HashSet<Integer>();
		int count = 0;
		
		for(Integer st : arr) {
			if(s.add(st)) {
			s.add(st);
			count++;
			System.out.println("Set elements : "+s);
			}
		}
		
		
		System.out.println("No. of unique elements : "+count);
		

	}

}
