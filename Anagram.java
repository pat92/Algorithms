//anagram

import java.util.Scanner;
import java.util.Arrays;

public class Anagram
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("First String : ");
		String s1 = sc.nextLine();
		System.out.print("Second String : ");
		String s2 = sc.nextLine();
		
		if(s1.length() == s2.length()){
		    char[] arr1 = s1.toCharArray();
		    char[] arr2 = s2.toCharArray();
		    
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		    
        Boolean anagram = Arrays.equals(arr1,arr2);
		System.out.println("Anagram : "+anagram);
		}
        
       
	}
}
