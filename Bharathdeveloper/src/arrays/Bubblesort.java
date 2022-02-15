package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,element;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Size of Arrays:");
		n=scan.nextInt();
		int[] arr =new int[n];
		System.out.println("Enter " +n+ "Elements:");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+ "");
		}
		for(i=0;i<n-1;i++)
			for(j=0;j<n-1;j++)
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		System.out.println("\n "+"Array elements after bubble sort are");
		{
			for(i=0;i<n;i++)
				System.out.println(arr[i]+"");
		}
		
	
		

	}

}
