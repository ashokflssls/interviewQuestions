package onlinesessions;

public class SortingArray {

	public static void main(String[] args) {

		int temp;
		int a[] = { 10, 20, 10, 40, 30, 45, 8 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i+1; j <a.length; j++) {
				
				if(a[i]>a[j]) {
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

		}

		for (int x : a) {
			System.out.println(x);
		}

	}
}
