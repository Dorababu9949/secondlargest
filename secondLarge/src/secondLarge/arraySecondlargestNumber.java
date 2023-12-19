package secondLarge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arraySecondlargestNumber {
	public static int getSecondLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];
	}

	public static int getSecondLargest1(int[] a1, int total) {
		Arrays.sort(a1);
		return a1[total - 2];
	}

	public static int getSecondLargest(Integer[] a2, int total) {
		List<Integer> list = Arrays.asList(a2);
		Collections.sort(list);
		int element = list.get(total - 2);
		return element;
	}

	public static void main(String args[]) {
		System.out.println("");
		int a[] = { 16, 24, 5, 63, 32, 21 };
		int b[] = { 4, 66, 89, 67, 33, 12, 55 };
		System.out.println("Second Largest: " + getSecondLargest(a, 6));
		System.out.println("Second Largest: " + getSecondLargest(b, 7));
//using arrays
		System.out.println("using arrays ----");
		int a1[] = { 1, 2, 5, 6, 3, 2 };
		int b1[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Second Largest: " + getSecondLargest(a1, 6));
		System.out.println("Second Largest: " + getSecondLargest(b1, 7));
//using using collections
		System.out.println("using using collections");
		Integer a2[] = { 1, 2, 5, 6, 3, 2 };
		Integer b2[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Second Largest: " + getSecondLargest(a2, 6));
		System.out.println("Second Largest: " + getSecondLargest(b2, 7));
	}
}