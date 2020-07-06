package onlinesessions;


interface X {
	public double add(int a, float b);
	// SAM --> if a interface has only one Abstract method SAM -- Functional
	
	default int add() {
		return 10;
	}
	
	
	// Interface
}

/*
 * class XImpl implements X {
 * 
 * @Override public void m1() {
 * 
 * System.out.println("m1 implemented.."); } }
 */

public class MyClass {

	public static void main(String[] args) {

		X obj =(x,y)->{
			return x+y;
		};
	
		double sum = obj.add(10,30.5F);
		System.out.println("Result is:"+sum);
		System.out.println(obj.add());
	}
}