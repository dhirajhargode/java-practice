import java.util.Scanner;

public class WordChain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}

		String[] temp = new String[n];
		int k = 0;
		temp[k] = arr[0];
		String s1 = temp[k];
		int count = 1;
		int x = 1;

		while (count < n) {
			for (int i = 1; i < n; i++) {
				// System.out.println("==>" + arr[i]);
				for (int j = 0; j < s1.length(); j++) {
					String a = s1.substring(j, s1.length());
					if (arr[i].contains(a) && a.length() >= 3) {
						// System.out.println(a);
						if (a.equals(arr[i].substring(0, a.length()))) {
							// System.out.println(arr[i] + " sub");
							if (arr[i].equals(s1))
								count++;
							k++;
							temp[k] = arr[i];
							s1 = arr[i];
							count++;
						}
					}
				}
			}
			if (count <= x)
				break;
		}

		int p = 0;
		for (int i = 0; i < n; i++) {
			if (temp[i] != null)
				p++;
		}

		// output
		if (p < n)
			System.out.println("IMPOSSIBLE");
		else {
			for (int i = 0; i < n; i++)
				System.out.print(temp[i] + " ");
		}

		sc.close();
	}
}

/*
 * 5 whisper sonnet person workshop network
 * 
 * 5 Dhiraj newgen showroom irajnew genshow
 * 
 * 5 Dhiraj ewgen showroom irajnew genshow
 * 
 * 5 Dhiraj newgen showroom irjnew genshow
 * 
 * 2 start mission
 * 
 */
