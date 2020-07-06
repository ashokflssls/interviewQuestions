import java.util.HashMap;
import java.util.Set;

public class NumberOfWords {

	public static void findNumberOfWords(String str) {

		String[] s = str.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();

		for (String tmpStr : s) {

			if (hm.containsKey(tmpStr.toLowerCase())) {
				hm.put(tmpStr.toLowerCase(), hm.get(tmpStr.toLowerCase()) + 1);
			} else {
				hm.put(tmpStr.toLowerCase(), 1);
			}

		}

		Set<String> s1=hm.keySet();
			
		for(String s2:s1) {
			if(hm.get(s2)>1) {
				System.out.println(s2+"***"+hm.get(s2));
			}
		}
			
			}
	

	public static void main(String[] args) {

		findNumberOfWords("hi hello Hi paka hello hi paka i am");
	}

}
