package OOPSAssignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		List<String>list1=new ArrayList<String>();
		list1.add("HCL");
		list1.add("Wipro");
		list1.add("Aspire Systems");
		list1.add("CTS");
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		Collections.reverse(list1);
		System.out.println(list1);
		
	}

}
