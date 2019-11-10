package prepare.exam;

import java.util.HashMap;
import java.util.Map.Entry;

// 1 reverse array without using 2nd array
public class ArraysDemo {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5 };
		arr1 = reverseArrayWithoutUsingAnotherArray(arr1);
		// System.out.println("1) reverse array without using 3rd array " +
		// arr1.toString());

		int arr2[] = { 1, 2, 3, 4, 5, 6, 1, 3, 4, 3, 1 };
		String maxElement = maxOccuranceOfElement(arr2);
		System.out.println(maxElement);

	}

	public static String maxOccuranceOfElement(int[] arr2) {

		HashMap<Integer, Integer> map = new HashMap<>();

		int occurance = 1;
		int element = arr2[0];
		boolean status = false;
		for (int i : arr2) {

			if (map.get(i) == null) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= occurance) {
				occurance = entry.getValue();
				element = entry.getKey();
				status = true;
			}
		}

		if (status)
			return "max occurance element is " + element + " and no of occurance is " + occurance;
		else
			return "no max occurance all are unique";

	}

	public static int[] reverseArrayWithoutUsingAnotherArray(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}

}
