package onlinesessions;

public class Child extends Parent {

	
	public void m2() {
		System.out.println("m2 method called from Child....");
	}

	public static void main(String[] args) {


		Child c = new Child();// obj
		c.m1();
		c.m2();// added the comment

	}
}
