package exception;

public class CustomExceptionExample1 {
	public static int Valid(int a,int b,int c)
	{
	
	if(a+b+c==180 && a!=0 && b!=0 && c!=0)
	     return 1;
	else
		return 0;
	}
		
public static void main(String[]args){
	int a=60, b=40, c=80;
	if((Valid(a,b,c)) ==1)
		System.out.println("Valid");
	else
		System.out.println("Invalid");
}
}



