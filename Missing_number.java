// missing number
public class Missing_number
{
    
	public static void main(String[] args) {
		int[] arr = {4,8,7,5,9,6,2,3};
		System.out.println("Missing number is "+new Main().findMissing(arr));
	}
	
	public int findMissing(int[] arr){
	    int n = arr.length+1;
	    int sumFirstOfNNum = (n*(n+1))/2;
	    int actualSum = 0;
	    for(int i = 0; i < arr.length ; i++){
	        actualSum += arr[i];
	    }
	    return (sumFirstOfNNum - actualSum);
	}
}
