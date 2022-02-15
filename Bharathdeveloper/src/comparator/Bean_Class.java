package comparator;

public class Bean_Class {
	
	private int id;
	private String name;
	private long contact;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public Bean_Class(int id,String name,long contact) {
		super();
		this.id=id;
		this.name=name;
		this.contact=contact;
	}
	public String getName() {
		return getName();
	}
	public void setName(String name) {
		this.name=name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact=contact;
	}
	public int CompareTo(Object o) {
		Bean_Class bn=(Bean_Class) o;
		
		if(price==bn.price)
		{
			return 0;
		} else if(price>bn.price)
		{
			return 1;
			
		}else {
			return -1;
		}
		
	}

}
