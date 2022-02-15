package exception;

public class TrycatchExample1 {

public static void main(String args[]) {
	try {
		int num=45/0;
		System.out.println(num);
	}
	catch(ArithmeticException e) {
		System.out.println("Number should not divided by zero");
	}
	finally {
		System.out.println("This is finally block");
	}
	System.out.println("out of try-catch-finally");
	
}
}

