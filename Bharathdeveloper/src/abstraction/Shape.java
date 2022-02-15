package abstraction;

public abstract class Shape {
	
	abstract void area (int x,int y);
	abstract void volume(int x,int y,int z);
	abstract void show(String message);
	{
		System.out.println("I am calculating the shape");
	}
	

	public static void main(String[] args) {
		

	}

}
