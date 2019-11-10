import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
  Write a program that reads N integers,
	then prints on a separate line the value of each distinct element 
	along with the number of times it occurs.
	the values should be printed in descending order of occurrences.

	Note: If the two or more number has the same number of occurrences, 
	the number who is smaller will come first in the ascending order. 
*/
public class IntegerSort2 {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		while (input != -1) {
			if (map.get(input) == null) {
				map.put(input, 1);
			} else {
				map.put(input, map.get(input) + 1);
			}
			input = sc.nextInt();
		}

		System.out.println(map.values());
		Set<Entry<Integer, Integer>> set = map.entrySet();
		//ArrayList<Entry<Integer, Integer>> arrayList = new ArrayList<Entry<Integer, Integer>>(set.entrySet());
		ArrayList<Entry<Integer, Integer>> arrayList = new ArrayList<Entry<Integer, Integer>>(map.entrySet());

		Collections.sort(arrayList, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Map.Entry<Integer, Integer> val1, Map.Entry<Integer, Integer> val2) {

				return (val2.getValue()).compareTo(val1.getValue());
			}

		});

		for (Map.Entry<Integer, Integer> entry : arrayList) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		sc.close();
	}
}
