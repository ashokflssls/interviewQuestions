package onlinesessions;

public class Man {

	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 

	public static void main(String[] args) {
		
		Man  m = new Man();
		m.setAge(19);
		m.setName("Adhi");
		
		System.out.println(m.getAge());
		System.out.println(m.getName());
	}
	

}
