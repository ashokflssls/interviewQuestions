package test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("ashok");
		list.add("RAJ");
		list.add("swamuy");
		list.add("asasdf");
		list.add("ashoasdfasdfasf");
		list.add("ashokasd");

		System.out.println(list);

		
		/*
		 * for(String list1:list) {
		 * 
		 * if(list1=="ashok") { list.remove("ashok"); } System.out.println(list1); }
		 */
		
		
		ListIterator<String> list1 = list.listIterator();
		
		while(list1.hasNext()) {
			String s = list1.next();
			if(s.equals("ashok")) {
				list1.remove();
			}
			else if((list1.hasNext())){
			System.out.println(list1.next());
			}
		}
		
	}

}
