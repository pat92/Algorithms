//palindrome
import java.util.Scanner;
import java.util.*;

public class Palindrome
{
    
	public static void main(String[] args) {
	    Scanner sc =  new Scanner(System.in);
	    String word = sc.nextLine();
		
		System.out.print("Word "+ word +" is a palidrome = "+new Palindrome().checkPalidrome(word));
		
		//System.out.println("Hello World");
	}
	
	public Boolean checkPalidrome(String word){
	    String reverseWord = rev(word);
	    if(word.equals(reverseWord))
	        return true;
	   else
	    return false;
	}
	
	public String rev(String word){
	    if(word == null || word.isEmpty()){
	        return word;
	    }
	    
	    return word.charAt(word.length()-1) + rev(word.substring(0,word.length()-1));
	}
}
