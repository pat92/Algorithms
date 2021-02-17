package test;

class RotateRev{
	
	void leftRotate(int[] a, int d) {
		
		if(d == 0)
			return;
		
		int n = a.length;
		
		d = d%n;
		reverseArr(a,0,d-1);
		reverseArr(a,d,n-1);
		reverseArr(a,0,n-1);
		
	}
	
	void reverseArr(int[] a, int start, int end) {
		
		int temp;
		while(start<end) {
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		
	}
	
	void printArr(int[] a) {
		for(int i = 0;i<a.length;i++)
			System.out.println(a[i]+" ");
	}
	
}
public class RecursiveRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateRev rotate = new RotateRev();
		
		
		int[] arr= {1,2,3,4,5,6,7};
		//int n = arr.length;
		int d = 2;
		rotate.leftRotate(arr,d);
		rotate.printArr(arr);

	}

}
