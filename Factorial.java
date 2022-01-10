//factorial
public class Factorial
{
	public static void main(String[] args) {
		int num = 10;
		Long factorialResult = 1l;
		
		for(int i=1; i<= num; i++){
		    factorialResult *=i;
		}
		System.out.print("Factorial of "+num+" is : "+factorialResult);
	}
}
