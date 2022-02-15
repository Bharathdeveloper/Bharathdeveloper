package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Selectionsort {
	static void sel_sort(int numArray[])
	{
		int n=numArray.length;
		for(int i=0;i<n-1;i++)
		{
			int min_idx=i;
			for(int j=i+1;j<n-1;j++)
				if(numArray[j]<numArray[min_idx])
					min_idx=j;
			int temp=numArray[min_idx];
			numArray[min_idx] = numArray[i];
			numArray[i]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,element;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		n=scan.nextInt();
		int[] numArray=new int[n];
		System.out.println("Enter" +n+ "Elements:");
		for(i=0;i<n;i++)
			numArray[i]=scan.nextInt();
		System.out.println("Original Array:" +Arrays.toString(numArray));
		sel_sort(numArray);
		System.out.println("Sorted Array:" +Arrays.toString(numArray));

	}

}
