package test;

public class ComparingString {

	private String name = "raju";

	public boolean validateString(String string) {

		boolean temp = false;

		if ((string != null) && string != "")
				temp = true;

		return temp;

	}

	public static void main(String[] args) {

		ComparingString s = new ComparingString();

		System.out.println(s.validateString(" "));

	}

}
