package arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any number");
		num=sc.nextInt();
		
		digit=num;
		while(digit>=10)
		{
			digit=digit/10;
		}
		digit=num%10;
		
		System.out.println("\n The first Digit of a Given number");
		System.out.println("\n The Last Digit of a Given number");
			
		

	}

}
