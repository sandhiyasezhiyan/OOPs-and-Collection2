package OOPSAssignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecond {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		for(int i=list1.size()-2;i>=0;i--) {
			list1.get(i);
			}
		System.out.println(list1.get(4));
		
	}

}
