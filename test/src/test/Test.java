package test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);

		List<String> list = new ArrayList<String>();

		list.add("ashok babu");

		list.add("raj");

		list.add("swamuy");

		list.add("asasdf");
		list.add("ashoasdfasdfasf");
		list.add("ashokasd");
		System.out.println("calling from main..");
		System.out.println("m1() calling........");
		List returnedList = new Test2().m1(list);
		System.out.println("completed execution of m1().....");

		ListIterator<String> list1 = returnedList.listIterator();

		while (list1.hasNext()) {
			System.out.println(list1.next());
		}

		new Test2().m2();

		System.out.println("End of main class");

	}

}
