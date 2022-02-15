package interfaces;

public class Interfacedemo implements S1,S2{
	
	public Interfacedemo() {
		this.defmethod();
	
	}	
	
	
	
	
		
  public void defmethod() {
		System.out.println("Method is here");
		
	}





public void show() {
		System.out.println("Method overriding is here");
	}
	
static void staticdemo() {
		S2.display();
	}
		
	

}
