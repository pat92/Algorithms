import java.util.ArrayList;
import java.util.Stack;
import java.util.List;
import java.util.stream.Collectors;

public class Sum
{
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum =0;
		
		for(int i: arr){
		    sum += i;    
		}
		System.out.print("Sum of numbers from 1 - 10 ->"+sum);
	}
}
