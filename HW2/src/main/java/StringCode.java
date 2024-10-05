import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		int max = 1;
		int l = 0, r;
		int dem = 1;
		for(r = 1; r < str.length(); r++) {
			if(str.charAt(r) == str.charAt(l)) {
				dem++;
				continue;
			}
			max = Math.max(max, dem);
			if(str.charAt(r) != str.charAt(l)) {
				l = r;
				dem = 0;
			}
		}

		return max;
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
		String res = "";
		int n = str.length();
		while(str.charAt(n - 1) >= '0' && str.charAt(n - 1) <= '9') {
			n--;
		}
		for(int i = 0; i < n; i++) {
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				for(int j = 1; j <= str.charAt(i) - '0'; j++) {
					res += str.charAt(i + 1);
				}
			} else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				res += str.charAt(i);
			}

		}
		return res;
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		if(len <= 0 || a.length() < len || b.length() < len) {
			return false;
		}

		HashSet<String> st = new HashSet<>();

		for(int i = 0; i <= a.length() - len; i++) {
			st.add(a.substring(i, i + len));
		}

		for(int i = 0; i <= b.length() - len; i++) {
			if(st.contains(b.substring(i, i + len))) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		//System.out.println(maxRun(str));
		//System.out.println(blowup(str));
		if(stringIntersect(str1, str2, 3)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
