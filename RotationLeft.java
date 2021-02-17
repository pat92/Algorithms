package test;

class Rotate{
	
	void leftRotate(int[] a, int d, int n) {
		
		for(int i=0;i<d;i++)
		 rotateByOne(a,n);
		
	}
	void rotateByOne(int[] a,int n) {
		
		int i, tmp = a[0];
		for(i=0;i<n-1;i++) 
			a[i]=a[i+1];
		a[i]=tmp;
		
		
	}
	
	void printArray(int[] ar, int n) {
		for(int i=0;i<n;i++) {
			System.out.println("New Array : "+ar[i]+" ");
		}
	}
	
}
public class RotationLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5};
		Rotate rotate = new Rotate();
		rotate.leftRotate(arr, 4, 5);
		rotate.printArray(arr, 5);
		

	}

}
