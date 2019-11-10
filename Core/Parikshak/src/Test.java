import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {

		Map<String, String> unsortedMap = new HashMap<String, String>();

		unsortedMap.put("E", "E Val");
		unsortedMap.put("F", "F Val");
		unsortedMap.put("H", "H Val");
		unsortedMap.put("B", "B Val");
		unsortedMap.put("C", "C Val");
		unsortedMap.put("A", "B Val");
		unsortedMap.put("G", "G Val");
		unsortedMap.put("D", "D Val");

		Map<String, String> sortedMap = new TreeMap<String, String>(unsortedMap);

		System.out.println("\nAfter sorting..");
		for (Map.Entry<String, String> mapEntry : sortedMap.entrySet()) {
			System.out.println(mapEntry.getKey() + " \t" + mapEntry.getValue());

		}

	}
}