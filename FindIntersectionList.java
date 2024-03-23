package OOPSAssignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionList {
public static void main(String[] args) {
	Integer[] num1 = {3,2,11,4,6,7};
	Integer[] num2 = {1,2,8,4,9,7};
	List<Integer>list1=new ArrayList<Integer>(Arrays.asList(num1));
	List<Integer>list2 = new ArrayList<Integer>(Arrays.asList(num2));
	
	for(int i=0;i<list1.size();i++) {
		for(int j=0;j<list2.size();j++) {
			Integer integer1 = list1.get(i);
			Integer integer2 = list2.get(j);
			if(integer1 == integer2) {
				System.out.println(integer2);
			}
			
			
		}
	}
}

}
