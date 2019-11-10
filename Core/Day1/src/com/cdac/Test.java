package com.cdac;

import java.util.*;

class GeoCache {

	public static void main(String[] args) {

		String[] a = { "map", "pen", "marble", "key" };
		Othello o = new Othello();
		Arrays.sort(a, o);
		for (String s2 : a) {
			System.out.println(Arrays.binarySearch(a, "map"));
			System.out.println(" " + s2);

		}

	}

	static class Othello implements Comparator<String> {

		public int compare(String a, String b) {
			return b.compareTo(a);
		}

		public static int binarySearch(Object[] a, Object key) {
			return binarySearch0(a, 0, a.length, key);
		}

		private static int binarySearch0(Object[] a, int fromIndex, int toIndex, Object key) {
			int low = fromIndex;
			int high = toIndex - 1;

			while (low <= high) {
				int mid = (low + high) >>> 1;
				@SuppressWarnings("rawtypes")
				Comparable midVal = (Comparable) a[mid];
				@SuppressWarnings("unchecked")
				int cmp = midVal.compareTo(key);

				if (cmp < 0)
					low = mid + 1;
				else if (cmp > 0)
					high = mid - 1;
				else
					return mid; // key found
			}
			return -(low + 1); // key not found.
		}
	}
}