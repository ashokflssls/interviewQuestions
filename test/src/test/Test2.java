package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {

	public List m1(List list) {
		System.out.println("in method1****");
		Iterator iterator = list.iterator();
		List list2 = new ArrayList();

		while (iterator.hasNext()) {

			list2.add(iterator.next());
			//System.out.println(iterator.next());
		}
		System.out.println("end of  while loop");
		return list2;

	}

	public void m2() {
		System.out.println("in m2()*******");

		new Test3().m3();
	}

}
