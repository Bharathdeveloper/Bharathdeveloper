package arrays;

public class Factorial {
	int[]arr=new int[]{1,5,7,9,11};
	int temp;
	for(int i=0;i<arr.length;i++)
	{
		for (int j=i+1;j<arr.length;i++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return arr[length-1];
	System.out.println("Largest element of ")

}
