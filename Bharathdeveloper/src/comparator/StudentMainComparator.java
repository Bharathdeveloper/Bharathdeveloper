package comparator;
import java.util.ArrayList;
import java.util.Collections;
public class StudentMainComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bean_Class> arr =new ArrayList<Bean_Class>();
		
		arr.add(new Bean_Class(203,"Bhichu",890765));
		arr.add(new Bean_Class(204,"ram",789543));
		arr.add(new Bean_Class(205,"raghul",459089));
		
		Collections.sort(arr, new StudentMainComparator());
		for(Bean_Class b :arr)
			System.out.println(b.getName()+ "+b.getContact()+ " +b.getId());

	}

}
